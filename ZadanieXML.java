/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadaniexml;

import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/**
 *
 * @author Joanna
 */
public class ZadanieXML {


  

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
         
   File file = new File("/Users/Joanna/Desktop/labDataExample.xml");
   DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
   DocumentBuilder db = dbf.newDocumentBuilder();
   Document doc = db.parse(file);
   doc.getDocumentElement().normalize();

   NodeList nodeLst = doc.getElementsByTagName("Par");

    for (int s = 0; s < nodeLst.getLength(); s++) {

     Node fstNode = nodeLst.item(s);

     if (fstNode.getNodeType() == Node.ELEMENT_NODE) {

      Element fstElmnt = (Element) fstNode;

      System.out.println("Nazwa Badania: "
       + fstElmnt.getAttribute("name"));
      System.out.println("Wartosc: "
       + fstElmnt.getAttribute("value"));
    }

    }
    }
}

    
    

