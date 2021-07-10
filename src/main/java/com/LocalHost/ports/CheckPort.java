package com.LocalHost.ports;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CheckPort {
         void Check() throws Exception {
             List<Elements> list = new ArrayList<>();
             List<Integer> PortList = new ArrayList<>();
             for (int port = 0; port < 9999; port++) {

                 try {
                     URL url = new URL("http://localhost:" + port);
                     Document document = Jsoup.connect(String.valueOf(url)).get();
                     Elements title = document.getElementsByTag("title");

                        //--

                            //--
                     list.add(title);
                     PortList.add(port);


                 } catch (Exception e) {
                     //System.out.println("Did't found any site "+ port);
                 }

             }
             int size = list.size();
             for (int i = 0; i < size; i++) {
                 System.out.println("-------------index["+i+"]------------------");

                 String subServiceName = list.get(i).toString();
                 String New_services_SUB = subServiceName.substring(7,subServiceName.length()-8);



                 System.out.println("Title : " + New_services_SUB );
                 System.out.println("Port List : " + PortList.get(i)+"\n");

                 List<String> TitleList = new ArrayList<>();
                 TitleList.add(New_services_SUB);


                 FileWriter myWriter = new FileWriter("Report.txt");
                 myWriter.write("Title : " + New_services_SUB);
                 myWriter.write("Port List : " + PortList.get(i));
             }
         }

    }


