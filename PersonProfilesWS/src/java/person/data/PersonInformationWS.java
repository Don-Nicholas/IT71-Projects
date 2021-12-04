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
    
    @WebMethod(operationName = "updatePersonProfile")
    public String updatePersonProfile(
            @WebParam(name="id") java.lang.Integer id,
            @WebParam(name="firstname") java.lang.String firstname,
            @WebParam(name="lastname") java.lang.String lastname,
            @WebParam(name="birthdate") java.lang.String birthdate) {
        
          PersonProfile p = new PersonProfile();
          p.setId(id);
          p.setFirstname(firstname);
          p.setLastname(lastname);
          p.setBirthdate(birthdate);
          p.update();
          
          String updated = "\nFirstname: "+firstname+"\nLastname: "+lastname+"\nBirthdate: "+birthdate;
        return updated;
    }
    
    @WebMethod(operationName = "selectAllPersonInformation")
    public ArrayList<String[]> selectAllPersonInformation() {
        
        ArrayList<String[]> personsInfo = new ArrayList<String[]>();
        
        PersonProfile p = new PersonProfile();
        p.select();
        for (PersonProfile a : p.getcData()) {
            String[] info = new String[5];
            info[0] = String.valueOf(a.getId());
            info[1] = a.getFirstname();
            info[2] = a.getLastname();
            info[3] = a.getBirthdate();
            info[4] = String.valueOf(getAge(a.getBirthdate()));
            personsInfo.add(info);
        }
        return personsInfo;
    }
    
    @WebMethod(operationName = "selectPersonInformationByID")
    public String[] selectPersonInformationByID(@WebParam(name="id") Integer id) {
              
        PersonProfile p = new PersonProfile();
        p.selectById(id);
        String[] info = new String[5];
        info[0] = String.valueOf(p.getId());
        info[1] = p.getFirstname();
        info[2] = p.getLastname();
        info[3] = p.getBirthdate();
        info[4] = String.valueOf(getAge(p.getBirthdate()));
        return info;
    }
    
    @WebMethod(operationName = "selectPersonInformationByFilterByFullname")
    public ArrayList<String[]> selectPersonInformationByFilterByFullname(@WebParam(name="fullname") String fullname) {
        
        ArrayList<String[]> personsInfo = new ArrayList<>();
        
        PersonProfile p = new PersonProfile();
        p.selectFilterByFullname(fullname);
        for (PersonProfile a : p.getcData()) {
            String[] info = new String[5];
            info[0] = String.valueOf(a.getId());
            info[1] = a.getFirstname();
            info[2] = a.getLastname();
            info[3] = a.getBirthdate();
            info[4] = String.valueOf(getAge(a.getBirthdate()));
            personsInfo.add(info);
        }
        return personsInfo;
    }
    
    @WebMethod(operationName = "delete")
    public void delete(@WebParam(name="id") Integer id, 
            @WebParam(name="firstname") String firstname, 
            @WebParam(name="lastname") String lastname) {
   
        PersonProfile p = new PersonProfile();
        p.setId(id);
        p.setFirstname(firstname);
        p.setLastname(lastname);
        p.setBirthdate(firstname);
        p.delete();
        
    }
    
    @WebMethod(operationName = "getAge")
    public int getAge(@WebParam(name="birtdate") String birthdate) {
        
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.parse(birthdate);
        
        Period age = Period.between(birthday, today);
        
        return age.getYears();
    }
}
