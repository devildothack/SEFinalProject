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
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultTreeCellRenderer;

public class TreePanel2 extends JPanel implements TreeSelectionListener {
    //private JEditorPane htmlPane;
    Color c = new Color(229, 157, 84);
    
    private final JTree tree;

    public TreePanel2() {

        this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        this.setPreferredSize(new Dimension(150, 450));

        DefaultMutableTreeNode top;
        //Create the nodes.
        top = new DefaultMutableTreeNode("The University of Texas at Bronwsville");
        createNodes(top);
        //Create a tree that allows one selection at a time.
        tree = new JTree(top);
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        //Set the icon for leaf nodes.
        ImageIcon leafIcon = createImageIcon("/images/SElogomini.png");
        ImageIcon closedIcon = createImageIcon("/images/UTBlogomini.png");
        if (leafIcon != null) {
            DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
            renderer.setLeafIcon(leafIcon);
            renderer.setOpenIcon(closedIcon);
            renderer.setClosedIcon(closedIcon);
            tree.setCellRenderer(renderer);
        }
        //Listen for when the selection changes.
        tree.addTreeSelectionListener(this);
        //Create the scroll pane and add the tree to it. 
        JScrollPane treeView = new JScrollPane(tree);
        treeView.setPreferredSize(new Dimension(140, 410));
        add(treeView);
    }

    /** Required by TreeSelectionListener interface. */
    @Override
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                           tree.getLastSelectedPathComponent();

        if (node == null) return;

        Object nodeInfo = node.getUserObject();
        if (node.isLeaf()) {
            
        } 
    }

    private void createNodes(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode colleges, education, liberalarts, nursing, mathscience, business, biomedichealth,
                                epls, hhp, llis, tli, behavioralsciences, communication, criminaljustice, english,
                                government, history, moderlanguages, music, visualarts,
                                bioscience, chemenvsciences, mathematics, physnastro,engincompscience,
                                compuscience, cs, cis, engiphysics, engitech,
                                faculty, studentstats, degrees, iglesias, quweider, poveda, batcs, mscs;

        //colleges = new DefaultMutableTreeNode("Colleges");
        //top.add(colleges);
        
        education = new DefaultMutableTreeNode("College of Education");
        top.add(education);
        
        liberalarts = new DefaultMutableTreeNode("College of Liberal Arts");
        top.add(liberalarts);
        
        nursing = new DefaultMutableTreeNode("College of Nursing");
        top.add(nursing);
        
        mathscience = new DefaultMutableTreeNode("College of Mathematics and Technology");
        top.add(mathscience);
        
        bioscience = new DefaultMutableTreeNode("Biological Sciences");
        mathscience.add(bioscience);
        chemenvsciences = new DefaultMutableTreeNode("Chemistry and Envt'l Sciences");
        mathscience.add(chemenvsciences);
        mathematics = new DefaultMutableTreeNode("Mathematics");
        mathscience.add(mathematics);
        physnastro = new DefaultMutableTreeNode("Physics and Astronomy");
        mathscience.add(physnastro);
        engincompscience = new DefaultMutableTreeNode("School of Engineering and Computational Science");
        mathscience.add(engincompscience);
        
        
        compuscience = new DefaultMutableTreeNode("Computational Science");
        engincompscience.add(compuscience);
        cs = new DefaultMutableTreeNode("Computer Science");
        engincompscience.add(cs);
        cis = new DefaultMutableTreeNode("Computer Information Technology");
        engincompscience.add(cis);
        engiphysics = new DefaultMutableTreeNode("Engineering Physics");
        engincompscience.add(engiphysics);
        engitech = new DefaultMutableTreeNode("Engineering Technology");
        engincompscience.add(engitech);
        
        faculty = new DefaultMutableTreeNode("Faculty");
        cs.add(faculty);
        studentstats = new DefaultMutableTreeNode("Student Statistics");
        cs.add(studentstats);
        degrees = new DefaultMutableTreeNode("Degrees");
        cs.add(degrees);
        
        iglesias = new DefaultMutableTreeNode("Dr. J.R. Iglesias");
        faculty.add(iglesias);
        quweider = new DefaultMutableTreeNode("Dr. M.K. Quweider");
        faculty.add(quweider);
        poveda = new DefaultMutableTreeNode("Dr. J. Poveda");
        faculty.add(poveda);
        
        batcs = new DefaultMutableTreeNode("Bachelor of Science in Computer Science");
        degrees.add(batcs);
        mscs = new DefaultMutableTreeNode("Master of Science in Computer Science");
        degrees.add(mscs);
        
        
        
        business = new DefaultMutableTreeNode("College of Business");
        top.add(business);
        biomedichealth = new DefaultMutableTreeNode("College of Biomedical Sciences and Health Professions");
        top.add(biomedichealth);
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = TreePanel.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
