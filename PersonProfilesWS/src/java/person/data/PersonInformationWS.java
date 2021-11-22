/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person.data;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import cli.users.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author JM
 */
@WebService(serviceName = "PersonInformationWS")
public class PersonInformationWS {

    @WebMethod(operationName = "insertPersonProfile")
    public String insertPersonProfile(
            @WebParam(name="firstname") java.lang.String firstname,
            @WebParam(name="lastname") java.lang.String lastname,
            @WebParam(name="birthdate") java.lang.String birthdate) {
        
          PersonProfile p = new PersonProfile();
          p.setFirstname(firstname);
          p.setLastname(lastname);
          p.setBirthdate(birthdate);
          p.insert();
          
          String inserted = "\nFirstname: "+firstname+"\nLastname: "+lastname+"\nBirthdate: "+birthdate;
        return inserted;
    }
    
    @WebMethod(operationName = "selectAllPersonInformation")
    public ArrayList<String[]> selectAllPersonInformation() {
        
        ArrayList<String[]> personsInfo = new ArrayList<String[]>();
        
        PersonProfile p = new PersonProfile();
        p.select();
        for (PersonProfile a : p.getcData()) {
            String[] info = new String[4];
            info[0] = a.getFirstname();
            info[1] = a.getLastname();
            info[2] = a.getBirthdate();
            info[3] = String.valueOf(getAge(a.getBirthdate()));
            personsInfo.add(info);
        }
        return personsInfo;
    }
    
    @WebMethod(operationName = "selectPersonInformationById")
    public ArrayList<String> selecPersonInformationById(@WebParam(name="birtdate") Integer id) {
        
        ArrayList<String> personsInfo = new ArrayList<String>();
        
        PersonProfile p = new PersonProfile();
        p.select();
        for (PersonProfile a : p.getcData()) {
            personsInfo.add(a.getFirstname());
            personsInfo.add(a.getLastname());
            personsInfo.add(a.getBirthdate());
            personsInfo.add(String.valueOf(getAge(a.getBirthdate())));
        }
        return personsInfo;
    }
    
    @WebMethod(operationName = "selectPersonInformationByFilterByFullname")
    public ArrayList<String[]> selectPersonInformationByFilterByFullname(@WebParam(name="fullname") String fullname) {
        
        ArrayList<String[]> personsInfo = new ArrayList<>();
        
        PersonProfile p = new PersonProfile();
        p.selectFilterByFullname(fullname);
        for (PersonProfile a : p.getcData()) {
            String[] info = new String[4];
            info[0] = a.getFirstname();
            info[1] = a.getLastname();
            info[2] = a.getBirthdate();
            info[3] = String.valueOf(getAge(a.getBirthdate()));
            personsInfo.add(info);
        }
        return personsInfo;
    }
    
    @WebMethod(operationName = "getAge")
    public int getAge(@WebParam(name="birtdate") String birthdate) {
        
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.parse(birthdate);
        
        Period age = Period.between(birthday, today);
        
        return age.getYears();
    }
}
