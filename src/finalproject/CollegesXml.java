package finalproject;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jesse
 */
public class CollegesXml {
    
    //Colleges and missions
    String[] colleges = {"College of Education","College of Nursing","School of Business","College of Liberal Arts","College of Science, Math and Technology","College of Biomedical Sciences and Health Professions"};
    String[] mission = {"Our College is committed to provide the best quality education to students in a multicultural and intercultural setting. We deliver undergraduate and graduate programs based on proven best practice, knowledge acquisition, reflective inquiry, critical thinking and respect for the culturally and linguistically diverse learner. We also work to continuously develop a dynamic local, national, and international dimension that promotes innovation and contributes to scientific, educational, economic and social change. The innovative programs and courses at our College serve some 3,800 graduate and undergraduate students every semester. At the undergraduate level, we offer 30 undergraduate programs of which 22 are leading to teacher certification from elementary to post-secondary. In addition, we have non-teacher programs which lead to the B.S. in kinesiology and exercise science. At the graduate level, we offer 15 master's specializations in bilingual education, counseling and guidance, curriculum and instruction, educational leadership, educational technology, English as a second language, health and human performance, and special education. Doctoral candidates in curriculum and instruction can specialize in bilingual studies, educational leadership, educational technology, and higher education teaching.​​​​​​​​​​","Our college is committed to provide high quality nursing education for students and to provide opportunities for life-long learning for nurses. The College of Nursing also recognizes the diversity and uniqueness of the community that it serves, and is committed to the enhancement of the quality of health care through excellence in teaching, research, service, continuing education and the promotion of evidence-based practice.​​​​​​​​​","The School of Business is committed to educating and preparing students so that they may succeed in their academic career and professional endeavors. UTB/TSC provides a learning environment developed on an innovative curriculum, and offers opportunities for students to become involved in meaningful projects and internships that allow them to acquire experience while contributing to the reinforcement and expansion of their academic knowledge. The programs offered at the School of Business include an Associate of Arts in Business Administration, a Bachelor of Business Administration with different options in specialization and an M.B.A. These programs have been carefully designed with the purpose of helping students gain a well-rounded understanding of the various facets of the business world. The material is reinforced through research assignments, which serve to clarify relevant dimensions and prepare students to address key decisions in innovative ways. Furthermore, academic-level standards have been set high in order to offer students the opportunity to develop integrative, critical thinking, leadership and communication skills and to acquire an ample base of technical skills required for their profession.","The College of Liberal Arts is the largest and most diverse college of the University. It is comprised of ten academic departments — Behavioral Sciences, Criminal Justice, English, Communication, Government, History, Modern Languages, Music, and Visual Arts — and offers nearly 40 undergraduate programs of study and over one dozen graduate degrees. The 130 dedicated faculty members of the College of Liberal Arts comprise a vibrant community of teachers and scholars who share with their students their passion and knowledge of the arts, literature and history, and well as human and behavioral cultures. The College also supports specialized and innovative programs in Architecture, Forensic Investigation as well as a Spanish Translation and Interpreting Studies. Additionally the College of Liberal Arts provides cultural access and educational opportunities for the people of the Rio Grande Valley through its sponsorship and support of the Patron of the Arts Series, the Letras en el Estuario Binational Conference in Hispanic Letters, the creative writing journal, El Novostanderino, the Sabal Palms Writing Project, the South Texas Victim Symposium, the Texas Center for Border and Transnational Studies, and many other activities.","The College of Science at The University of Texas at Brownsville combines a strong commitment to high undergraduate education with the very best of a top-tier research university. Our focus is undergraduate and graduate education, and we provide opportunities to achieve your educational goals, whatever they are, from a bachelor's degree up to cooperative Ph.D. degree. Our strong and diverse faculty — many of whom are leading experts in the fields of science, medicine, mathematics, computer science, engineering and technology — will prepare you for the career of your choice.","The department of Biomedicine is currently under development in conjunction with a UT System initiative in Medical Education."};
    
    //College Departments
    String[] educationDepts = {"Educational Psychology and Leadership","Health and Human Performance","Language, Literacy and Intercultural Studies","Teaching, Learning and Innovation"};
    String[] nursingDepts = {"Nursing"};
    String[] businessDepts = {"Accounting and Management Information Systems","Applied Business Technology","Finance and Economics","Management and Marketing"};
    String[] artDepts = {"Behavioral Sciences","Communications","Criminal Justice","English","Government","History","Modern Languages","Music","Visual Arts"};
    String[] scienceDepts = {"Biological Sciences","Chemistry and Environmental Sciences","Computer Information Sciences","Engineering Department","Mathematics","Physics and Astronomy"};
    String[] biomedicalDepts = {"Allied Health"};
    
    
    public void writeXml(){
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        int i;
        try{
            builder = dbf.newDocumentBuilder();
            Document doc = builder.newDocument();
            Element root = doc.createElementNS("","colleges");
            doc.appendChild(root);
            
            for (i = 0; i < colleges.length; i++) {
                root.appendChild(College(doc,i,colleges[i],mission[i],educationDepts,nursingDepts,businessDepts,artDepts,scienceDepts,biomedicalDepts));
                
            }
            
            Transformer trans = TransformerFactory.newInstance().newTransformer();
            trans.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            //StreamResult result = new StreamResult(System.out);
            StreamResult result = new StreamResult(new File("colleges.xml"));
            trans.transform(source, result);
            
        }catch (ParserConfigurationException | DOMException | IllegalArgumentException | TransformerException e){
        }
    }
    
    private static Node College(Document doc,int id,String name,String mission,String[] education,String[] nursing,String[] business,String[] arts,String[] science,String[] bio){
        Element course = doc.createElement("college");
        course.setAttribute("id", String.valueOf(id));
        course.appendChild(CourseElements(doc, course, "school", name));
        course.appendChild(CourseElements(doc, course, "mission", mission));
        
        switch(id){
            case 0:
        for (String education1 : education) {
            course.appendChild(CourseElements(doc, course, "department", education1));
        }
            break;
            case 1:
        for (String nursing1 : nursing) {
            course.appendChild(CourseElements(doc, course, "department", nursing1));
        }    
            break;
            case 2:
        for (String busines : business) {
            course.appendChild(CourseElements(doc, course, "department", busines));
        }    
            break;
            case 3:
        for (String art : arts) {
            course.appendChild(CourseElements(doc, course, "department", art));
        }    
            break;
            case 4:
        for (String science1 : science) {
            course.appendChild(CourseElements(doc, course, "department", science1));
        }    
            break;
            case 5:
        for (String bio1 : bio) {
            course.appendChild(CourseElements(doc, course, "department", bio1));
        }    
            break;
            default:
            break;
              
        }        
        
        return course;
    }
    
    private static Node CourseElements(Document doc, Element element, String name, String value){
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        
        return node;
    }   
    
}
