/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import person.data.PersonInformationWS;
import person.data.PersonInformationWS_Service;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author JM
 */
public class Sample {
 public static void main(String[] args) {
     PersonInformationWS_Service service = new PersonInformationWS_Service();
     PersonInformationWS port = service.getPersonInformationWSPort();
     
     ArrayList<String> profiles = new ArrayList<String>();
     for(int i = 0; i < port.selectAllPersonInformation().size(); i++) {
         List<String> personInfo = port.selectAllPersonInformation().get(i).getItem();
         for(String e: personInfo) {
             profiles.add(e);
         }
     }
     
     for(String e: profiles) {
         System.out.println(e);
     }

 }   
}
