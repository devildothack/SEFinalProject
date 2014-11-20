package finalproject;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class TreePanel extends JPanel implements TreeSelectionListener {
    //private JEditorPane htmlPane;
    Color c = new Color(229, 157, 84);
    
    private final JTree tree;

    public TreePanel() {
        //super(new GridLayout(1,0));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        this.setPreferredSize(new Dimension(150, 450));
        //this.setBackground(utborange2);
        
        DefaultMutableTreeNode top;

        //Create the nodes.
        top = new DefaultMutableTreeNode("The University of Texas at Bronwsville");
        createNodes(top);

        //Create a tree that allows one selection at a time.
        tree = new JTree(top);
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

        //Listen for when the selection changes.
        tree.addTreeSelectionListener(this);

        //Create the scroll pane and add the tree to it. 
        JScrollPane treeView = new JScrollPane(tree);
        //treeView.setOpaque(true);
        //treeView.getViewport().setBackground(c);
        //treeView.getViewport().setBackground(Color.ORANGE);
        treeView.setPreferredSize(new Dimension(140, 410));
        //treeView.getViewport().setBackground(utborange2);
        add(treeView);
    }

    /** Required by TreeSelectionListener interface. */
    @Override
    public void valueChanged(TreeSelectionEvent e) {
//        DefaultMutableTreeNode node = (DefaultMutableTreeNode)
//                           tree.getLastSelectedPathComponent();
//
//        if (node == null) return;
//
//        Object nodeInfo = node.getUserObject();
//        if (node.isLeaf()) {
//            
//        } 
    }

    private void createNodes(DefaultMutableTreeNode top) {
//        DefaultMutableTreeNode colleges, education, liberalarts, nursing, mathscience, business, biomedichealth,
//                                epls, hhp, llis, tli, behavioralsciences, communication, criminaljustice, english,
//                                government, history, moderlanguages, music, visualarts,
//                                bioscience, chemenvsciences, mathematics, physnastro,engincompscience;
//
//        //colleges = new DefaultMutableTreeNode("Colleges");
//        //top.add(colleges);
//        
//        education = new DefaultMutableTreeNode("College of Education");
//        top.add(education);
//        
//        epls = new DefaultMutableTreeNode("Educational Psychology and Leadership Studies");
//        education.add(epls);
//        hhp = new DefaultMutableTreeNode("Health & Human Performance");
//        education.add(hhp);
//        llis = new DefaultMutableTreeNode("Language, Literacy, and Intercultural Studies");
//        education.add(llis);
//        tli = new DefaultMutableTreeNode("Teaching, Learning, and Innovation");
//        education.add(tli);
//        
//        liberalarts = new DefaultMutableTreeNode("College of Liberal Arts");
//        top.add(liberalarts);
//        
//        behavioralsciences = new DefaultMutableTreeNode("Behavioral Sciences");
//        liberalarts.add(behavioralsciences);
//        communication = new DefaultMutableTreeNode("Communication");
//        liberalarts.add(communication);
//        criminaljustice = new DefaultMutableTreeNode("Criminal Justice");
//        liberalarts.add(criminaljustice);
//        english = new DefaultMutableTreeNode("English");
//        liberalarts.add(english);
//        government = new DefaultMutableTreeNode("Government");
//        liberalarts.add(government);
//        history = new DefaultMutableTreeNode("History");
//        liberalarts.add(history);
//        moderlanguages = new DefaultMutableTreeNode("Modern Languages");
//        liberalarts.add(moderlanguages);
//        music = new DefaultMutableTreeNode("Music");
//        liberalarts.add(music);
//        visualarts = new DefaultMutableTreeNode("Visual Arts");
//        liberalarts.add(visualarts);
//        
//        nursing = new DefaultMutableTreeNode("College of Nursing");
//        top.add(nursing);
//        
//        mathscience = new DefaultMutableTreeNode("College of Mathematics and Technology");
//        top.add(mathscience);
//        
//        bioscience = new DefaultMutableTreeNode("Biological Sciences");
//        liberalarts.add(bioscience);
//        chemenvsciences = new DefaultMutableTreeNode("Chemistry and Envt'l Sciences");
//        liberalarts.add(chemenvsciences);
//        mathematics = new DefaultMutableTreeNode("Mathematics");
//        liberalarts.add(mathematics);
//        physnastro = new DefaultMutableTreeNode("Physics and Astronomy");
//        liberalarts.add(physnastro);
//        engincompscience = new DefaultMutableTreeNode("School of Engineering and Computational Science");
//        liberalarts.add(engincompscience);
//        
//        business = new DefaultMutableTreeNode("College of Business");
//        top.add(business);
//        biomedichealth = new DefaultMutableTreeNode("College of Biomedical Sciences and Health Professions");
//        top.add(biomedichealth);
//    }

}
}