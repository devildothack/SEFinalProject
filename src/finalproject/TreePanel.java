package finalproject;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package mygui;
//
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
//import java.awt.Insets;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTree;
//import javax.swing.event.TreeSelectionEvent;
//import javax.swing.event.TreeSelectionListener;
//import javax.swing.tree.DefaultMutableTreeNode;
//import javax.swing.tree.TreeSelectionModel;
//
///**
// *
// * @author Dalia
// */
//public class TreePanel extends JPanel implements TreeSelectionListener {
//
//    @Override
//    public void valueChanged(TreeSelectionEvent tse) {
//        
//        DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
//        if (node == null) return;
// 
//        Object nodeInfo = node.getUserObject();
//        if (node.isLeaf()) {
//            Department dept = (Department)nodeInfo;
//            System.out.println("selected the ...."+dept.toString() );
//   
//        } 
//        else {
//            ; 
//        }
//
//
//    }
//
//private JTree tree;
//DefaultMutableTreeNode top;
//    public TreePanel() {
//        this.setLayout(new GridBagLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
//        
//        //Layout
//        gbc.insets= new Insets(2,2,2,2);
//        gbc.weightx=1;
//        gbc.weighty=1;
//        gbc.gridx=0;
//        gbc.gridy=0;
//        gbc.gridheight=1;
//        gbc.gridwidth=1;
//        gbc.fill=GridBagConstraints.BOTH;
// 
//        
//        DefaultMutableTreeNode top = new DefaultMutableTreeNode("University Of Texas At Brownsville");
//        createNodes(top);
//        tree = new JTree(top);
//        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
//        
//        //Listen for when the selection changes.
//        tree.addTreeSelectionListener(this);
//
//        JScrollPane treeView = new JScrollPane(tree);
//        this.add(treeView,gbc);
// 
//    }
//
//    private void createNodes(DefaultMutableTreeNode top) {
//    DefaultMutableTreeNode SchoolsColleges = null;
//    DefaultMutableTreeNode Departments     = null;
//    
//    SchoolsColleges = new DefaultMutableTreeNode("Colleges or Schools");
//    top.add(SchoolsColleges);
//    
//    //Add Depts for Each College
//    DefaultMutableTreeNode computerSceince = new DefaultMutableTreeNode(new Department("Computer Science"));
//    SchoolsColleges.add(computerSceince);
//    DefaultMutableTreeNode chemistry = new DefaultMutableTreeNode(new Department("Chemistry"));
//    SchoolsColleges.add(chemistry);
//        DefaultMutableTreeNode engr = new DefaultMutableTreeNode(new Department("Engineering"));
//    SchoolsColleges.add(engr);
//        DefaultMutableTreeNode bio = new DefaultMutableTreeNode(new Department("Biology"));
//    SchoolsColleges.add(bio);
//    
//}
//    
//}
