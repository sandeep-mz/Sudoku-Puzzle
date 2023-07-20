 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdk;

import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import static java.awt.Color.white;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sande
 */
public class NewJFrame extends javax.swing.JFrame {
    
    private String turn = "1";
    private boolean globalFlag = true;
    private String solvedBoard [] [] = {
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"},
    };
    private void Assignturn(JButton btn){
        Selection1.setBackground(black);
        Selection2.setBackground(black);
        Selection3.setBackground(black);
        Selection4.setBackground(black);
        Selection5.setBackground(black);
        Selection6.setBackground(black);
        Selection7.setBackground(black);
        Selection8.setBackground(black);
        Selection9.setBackground(black);
                                                                                                                 
        btn.setBackground(blue);
        
    }
    private void ResetGame(){
        JButton predefinedBtns []={r2c1, r3c1, r3c3, r1c4, r2c5, r2c6, r3c5, r1c7, r1c8, r1c9, r2c7, r2c9, r3c8, r5c2, r5c3, r6c2, r4c5, r4c6, r6c4, r6c5, r4c8, r5c8, r5c7, r7c2, r8c1, r9c1, r9c2, r9c3, r7c5, r8c5, r9c6, r8c4, r7c7, r7c9, r8c9};
       // int = r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9,r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9,r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9,r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9,r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9,r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9,r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9,r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9,r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9;
        JButton btns [][] ={
            {r1c1,r1c2,r1c3,r1c4,jButton1,r1c6,r1c7,r1c8,r1c9}, //here we mistikly change the name of button;
            {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
            {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
            {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9}, 
            {r5c1,r5c2,r5c3,r5c4,c5r4,r5c6,r5c7,r5c8,r5c9}, //c5r4 insted of r5c5;
            {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9}, 
            {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9}, 
            {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
            {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},
        };
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                boolean flag = true;
                for(int k=0;k<predefinedBtns.length;k++){
                    if(btns[i][j]==predefinedBtns[k]){
                        flag = false;
                    }
                }
                if(flag==true){
                    btns[i][j].setText(""); 
                    btns[i][j].setForeground(black);
                    btns[i][j].setBackground(white);
                }
            }
        }
    }
    /**
     
     
     
     **/
    private void SeeSolution(){
         JButton predefinedBtns []={r2c1, r3c1, r3c3, r1c4, r2c5, r2c6, r3c5, r1c7, r1c8, r1c9, r2c7, r2c9, r3c8, r5c2, r5c3, r6c2, r4c5, r4c6, r6c4, r6c5, r4c8, r5c8, r5c7, r7c2, r8c1, r9c1, r9c2, r9c3, r7c5, r8c5, r9c6, r8c4, r7c7, r7c9, r8c9};
       // int = r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9,r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9,r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9,r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9,r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9,r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9,r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9,r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9,r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9;
        JButton btns [][] ={
            {r1c1,r1c2,r1c3,r1c4,jButton1,r1c6,r1c7,r1c8,r1c9}, //here we mistikly change the name of button;
            {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
            {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
            {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9}, 
            {r5c1,r5c2,r5c3,r5c4,c5r4,r5c6,r5c7,r5c8,r5c9}, //c5r4 insted of r5c5;
            {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9}, 
            {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9}, 
            {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
            {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},
        };
        if(globalFlag== true){
            globalFlag = false;
            solvebtn.setText("Hide solution");
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    boolean flag = true;
                    for(int k=0;k<predefinedBtns.length;k++){
                        if(btns[i][j]==predefinedBtns[k]){
                            flag = false; 
                        }
                    }
                    if(flag==true){
                        btns[i][j].setText(solvedBoard[i][j]); 
                        btns[i][j].setForeground(black);
                        btns[i][j].setBackground(white);
                    }
                }
            }
        }
        else{
            solvebtn.setText("Solution");
            globalFlag=true;
            ResetGame();
        }
    }
    
    private void Checkmoves(){
        JButton btns [][] = {
            {r1c1,r1c2,r1c3,r1c4,jButton1,r1c6,r1c7,r1c8,r1c9}, //here we mistikly change the name of button;
            {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
            {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
            {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9}, 
            {r5c1,r5c2,r5c3,r5c4,c5r4,r5c6,r5c7,r5c8,r5c9}, //c5r4 insted of r5c5;
            {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9}, 
            {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9}, 
            {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
            {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},
        };
    
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (btns[i][j].getText() != solvedBoard[i][j] && btns[i][j].getText()!="") {
                    // Set background color to red for wrong moves
                btns[i][j].setBackground(red);
            }
        }
    }
    }
    /**
     * Creates new form New
     * JFrame
     */ 
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        r1c5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        r1c1 = new javax.swing.JButton();
        r1c3 = new javax.swing.JButton();
        r1c2 = new javax.swing.JButton();
        r2c1 = new javax.swing.JButton();
        r3c1 = new javax.swing.JButton();
        r2c2 = new javax.swing.JButton();
        r2c3 = new javax.swing.JButton();
        r3c2 = new javax.swing.JButton();
        r3c3 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        r1c4 = new javax.swing.JButton();
        r1c6 = new javax.swing.JButton();
        r2c4 = new javax.swing.JButton();
        r3c4 = new javax.swing.JButton();
        r2c5 = new javax.swing.JButton();
        r2c6 = new javax.swing.JButton();
        r3c5 = new javax.swing.JButton();
        r3c6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        r1c7 = new javax.swing.JButton();
        r1c9 = new javax.swing.JButton();
        r1c8 = new javax.swing.JButton();
        r2c7 = new javax.swing.JButton();
        r3c7 = new javax.swing.JButton();
        r2c8 = new javax.swing.JButton();
        r2c9 = new javax.swing.JButton();
        r3c8 = new javax.swing.JButton();
        r3c9 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        r4c7 = new javax.swing.JButton();
        r4c9 = new javax.swing.JButton();
        r4c8 = new javax.swing.JButton();
        r5c7 = new javax.swing.JButton();
        r6c7 = new javax.swing.JButton();
        r5c8 = new javax.swing.JButton();
        r5c9 = new javax.swing.JButton();
        r6c8 = new javax.swing.JButton();
        r6c9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        r4c4 = new javax.swing.JButton();
        r4c6 = new javax.swing.JButton();
        r4c5 = new javax.swing.JButton();
        r5c4 = new javax.swing.JButton();
        r6c4 = new javax.swing.JButton();
        c5r4 = new javax.swing.JButton();
        r5c6 = new javax.swing.JButton();
        r6c5 = new javax.swing.JButton();
        r6c6 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        r7c1 = new javax.swing.JButton();
        r7c3 = new javax.swing.JButton();
        r7c2 = new javax.swing.JButton();
        r8c1 = new javax.swing.JButton();
        r9c1 = new javax.swing.JButton();
        r8c2 = new javax.swing.JButton();
        r8c3 = new javax.swing.JButton();
        r9c2 = new javax.swing.JButton();
        r9c3 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        r7c7 = new javax.swing.JButton();
        r7c9 = new javax.swing.JButton();
        r7c8 = new javax.swing.JButton();
        r8c7 = new javax.swing.JButton();
        r9c7 = new javax.swing.JButton();
        r8c8 = new javax.swing.JButton();
        r8c9 = new javax.swing.JButton();
        r9c8 = new javax.swing.JButton();
        r9c9 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        r7c4 = new javax.swing.JButton();
        r7c6 = new javax.swing.JButton();
        r7c5 = new javax.swing.JButton();
        r8c4 = new javax.swing.JButton();
        r9c4 = new javax.swing.JButton();
        r8c5 = new javax.swing.JButton();
        r8c6 = new javax.swing.JButton();
        r9c5 = new javax.swing.JButton();
        r9c6 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        r4c1 = new javax.swing.JButton();
        r4c3 = new javax.swing.JButton();
        r4c2 = new javax.swing.JButton();
        r5c1 = new javax.swing.JButton();
        r6c1 = new javax.swing.JButton();
        r5c2 = new javax.swing.JButton();
        r5c3 = new javax.swing.JButton();
        r6c2 = new javax.swing.JButton();
        r6c3 = new javax.swing.JButton();
        Selection1 = new javax.swing.JButton();
        Selection2 = new javax.swing.JButton();
        Selection3 = new javax.swing.JButton();
        Selection4 = new javax.swing.JButton();
        Selection5 = new javax.swing.JButton();
        Selection6 = new javax.swing.JButton();
        Selection7 = new javax.swing.JButton();
        Selection8 = new javax.swing.JButton();
        Selection9 = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        solvebtn = new javax.swing.JButton();
        checkbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku Puzzle");
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setMinimumSize(new java.awt.Dimension(146, 149));

        r1c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c1ActionPerformed(evt);
            }
        });

        r1c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c3ActionPerformed(evt);
            }
        });

        r1c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c2ActionPerformed(evt);
            }
        });

        r2c1.setBackground(new java.awt.Color(102, 153, 255));
        r2c1.setForeground(new java.awt.Color(0, 0, 0));
        r2c1.setText("4");
        r2c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c1ActionPerformed(evt);
            }
        });

        r3c1.setBackground(new java.awt.Color(102, 153, 255));
        r3c1.setForeground(new java.awt.Color(0, 0, 0));
        r3c1.setText("7");
        r3c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c1ActionPerformed(evt);
            }
        });

        r2c2.setForeground(new java.awt.Color(0, 0, 0));
        r2c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c2ActionPerformed(evt);
            }
        });

        r2c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c3ActionPerformed(evt);
            }
        });

        r3c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c2ActionPerformed(evt);
            }
        });

        r3c3.setBackground(new java.awt.Color(102, 153, 255));
        r3c3.setForeground(new java.awt.Color(0, 0, 0));
        r3c3.setText("6");
        r3c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r3c1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r2c2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r3c2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(r1c3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r3c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setMinimumSize(new java.awt.Dimension(146, 149));

        r1c4.setBackground(new java.awt.Color(102, 153, 255));
        r1c4.setForeground(new java.awt.Color(0, 0, 0));
        r1c4.setText("5");
        r1c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c4ActionPerformed(evt);
            }
        });

        r1c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c6ActionPerformed(evt);
            }
        });

        r2c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c4ActionPerformed(evt);
            }
        });

        r3c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c4ActionPerformed(evt);
            }
        });

        r2c5.setBackground(new java.awt.Color(102, 153, 255));
        r2c5.setForeground(new java.awt.Color(0, 0, 0));
        r2c5.setText("7");
        r2c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c5ActionPerformed(evt);
            }
        });

        r2c6.setBackground(new java.awt.Color(102, 153, 255));
        r2c6.setText("8");
        r2c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c6ActionPerformed(evt);
            }
        });

        r3c5.setBackground(new java.awt.Color(102, 153, 255));
        r3c5.setText("4");
        r3c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c5ActionPerformed(evt);
            }
        });

        r3c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c6ActionPerformed(evt);
            }
        });

        jButton1.setText(" ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r3c4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r1c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r2c5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c6, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(r3c6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r1c6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r2c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setMinimumSize(new java.awt.Dimension(146, 149));
        jPanel15.setPreferredSize(new java.awt.Dimension(161, 158));

        r1c7.setBackground(new java.awt.Color(102, 153, 255));
        r1c7.setForeground(new java.awt.Color(0, 0, 0));
        r1c7.setText("7");
        r1c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c7ActionPerformed(evt);
            }
        });

        r1c9.setBackground(new java.awt.Color(102, 153, 255));
        r1c9.setText("4");
        r1c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c9ActionPerformed(evt);
            }
        });

        r1c8.setBackground(new java.awt.Color(102, 153, 255));
        r1c8.setForeground(new java.awt.Color(0, 0, 0));
        r1c8.setText("3");
        r1c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c8ActionPerformed(evt);
            }
        });

        r2c7.setBackground(new java.awt.Color(102, 153, 255));
        r2c7.setForeground(new java.awt.Color(0, 0, 0));
        r2c7.setText("5");
        r2c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c7ActionPerformed(evt);
            }
        });

        r3c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c7ActionPerformed(evt);
            }
        });

        r2c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c8ActionPerformed(evt);
            }
        });

        r2c9.setBackground(new java.awt.Color(102, 153, 255));
        r2c9.setForeground(new java.awt.Color(0, 0, 0));
        r2c9.setText("9");
        r2c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c9ActionPerformed(evt);
            }
        });

        r3c8.setBackground(new java.awt.Color(102, 153, 255));
        r3c8.setText("2");
        r3c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c8ActionPerformed(evt);
            }
        });

        r3c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r3c7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r1c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(r2c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r3c8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r2c9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r3c9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1c9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r2c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r2c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r3c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r3c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r3c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setMinimumSize(new java.awt.Dimension(146, 149));

        r4c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c7ActionPerformed(evt);
            }
        });

        r4c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c9ActionPerformed(evt);
            }
        });

        r4c8.setBackground(new java.awt.Color(102, 153, 255));
        r4c8.setText("9");
        r4c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c8ActionPerformed(evt);
            }
        });

        r5c7.setBackground(new java.awt.Color(102, 153, 255));
        r5c7.setText("2");
        r5c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c7ActionPerformed(evt);
            }
        });

        r6c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c7ActionPerformed(evt);
            }
        });

        r5c8.setBackground(new java.awt.Color(102, 153, 255));
        r5c8.setText("8");
        r5c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c8ActionPerformed(evt);
            }
        });

        r5c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c9ActionPerformed(evt);
            }
        });

        r6c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c8ActionPerformed(evt);
            }
        });

        r6c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(r5c7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(r4c7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r6c7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(r5c8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(r6c8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6c9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r4c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r5c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r5c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(r5c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setMinimumSize(new java.awt.Dimension(146, 149));

        r4c4.setText(" ");
        r4c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c4ActionPerformed(evt);
            }
        });

        r4c6.setBackground(new java.awt.Color(102, 153, 255));
        r4c6.setForeground(new java.awt.Color(0, 0, 0));
        r4c6.setText("5");
        r4c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c6ActionPerformed(evt);
            }
        });

        r4c5.setBackground(new java.awt.Color(102, 153, 255));
        r4c5.setForeground(new java.awt.Color(0, 0, 0));
        r4c5.setText("3");
        r4c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c5ActionPerformed(evt);
            }
        });

        r5c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c4ActionPerformed(evt);
            }
        });

        r6c4.setBackground(new java.awt.Color(102, 153, 255));
        r6c4.setText("1");
        r6c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c4ActionPerformed(evt);
            }
        });

        c5r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5r4ActionPerformed(evt);
            }
        });

        r5c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c6ActionPerformed(evt);
            }
        });

        r6c5.setBackground(new java.awt.Color(102, 153, 255));
        r6c5.setForeground(new java.awt.Color(0, 0, 0));
        r6c5.setText("8");
        r6c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c5ActionPerformed(evt);
            }
        });

        r6c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r6c4, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(r5c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r4c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c5r4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r4c5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r6c5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6c6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r5c6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r4c6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r4c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r5c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r5c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(c5r4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r6c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel21.setMinimumSize(new java.awt.Dimension(146, 149));

        r7c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c1ActionPerformed(evt);
            }
        });

        r7c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c3ActionPerformed(evt);
            }
        });

        r7c2.setBackground(new java.awt.Color(102, 153, 255));
        r7c2.setText("4");
        r7c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c2ActionPerformed(evt);
            }
        });

        r8c1.setBackground(new java.awt.Color(102, 153, 255));
        r8c1.setForeground(new java.awt.Color(0, 0, 0));
        r8c1.setText("3");
        r8c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c1ActionPerformed(evt);
            }
        });

        r9c1.setBackground(new java.awt.Color(102, 153, 255));
        r9c1.setText("6");
        r9c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c1ActionPerformed(evt);
            }
        });

        r8c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c2ActionPerformed(evt);
            }
        });

        r8c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c3ActionPerformed(evt);
            }
        });

        r9c2.setBackground(new java.awt.Color(102, 153, 255));
        r9c2.setText("8");
        r9c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c2ActionPerformed(evt);
            }
        });

        r9c3.setBackground(new java.awt.Color(102, 153, 255));
        r9c3.setText("9");
        r9c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r8c1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(r7c1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r9c1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(r9c2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(r7c2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r8c2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r7c3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r8c3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r9c3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r7c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r7c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r9c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.setMinimumSize(new java.awt.Dimension(146, 149));

        r7c7.setBackground(new java.awt.Color(102, 153, 255));
        r7c7.setText("9");
        r7c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c7ActionPerformed(evt);
            }
        });

        r7c9.setBackground(new java.awt.Color(102, 153, 255));
        r7c9.setText("2");
        r7c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c9ActionPerformed(evt);
            }
        });

        r7c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c8ActionPerformed(evt);
            }
        });

        r8c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c7ActionPerformed(evt);
            }
        });

        r9c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c7ActionPerformed(evt);
            }
        });

        r8c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c8ActionPerformed(evt);
            }
        });

        r8c9.setBackground(new java.awt.Color(102, 153, 255));
        r8c9.setText("6");
        r8c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c9ActionPerformed(evt);
            }
        });

        r9c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c8ActionPerformed(evt);
            }
        });

        r9c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r8c8, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(r9c8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r7c8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r8c9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r7c9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r8c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r9c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.setMinimumSize(new java.awt.Dimension(146, 149));

        r7c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c4ActionPerformed(evt);
            }
        });

        r7c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c6ActionPerformed(evt);
            }
        });

        r7c5.setBackground(new java.awt.Color(102, 153, 255));
        r7c5.setForeground(new java.awt.Color(0, 0, 0));
        r7c5.setText("5");
        r7c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c5ActionPerformed(evt);
            }
        });

        r8c4.setBackground(new java.awt.Color(102, 153, 255));
        r8c4.setText("9");
        r8c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c4ActionPerformed(evt);
            }
        });

        r9c4.setRolloverEnabled(false);
        r9c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c4ActionPerformed(evt);
            }
        });

        r8c5.setBackground(new java.awt.Color(102, 153, 255));
        r8c5.setText("6");
        r8c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c5ActionPerformed(evt);
            }
        });

        r8c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c6ActionPerformed(evt);
            }
        });

        r9c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c5ActionPerformed(evt);
            }
        });

        r9c6.setBackground(new java.awt.Color(102, 153, 255));
        r9c6.setText("1");
        r9c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r7c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r8c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(r9c4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r7c5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r9c5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(r8c6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r9c6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r7c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r8c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r8c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r9c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setMinimumSize(new java.awt.Dimension(146, 149));

        r4c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c1ActionPerformed(evt);
            }
        });

        r4c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c3ActionPerformed(evt);
            }
        });

        r4c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c2ActionPerformed(evt);
            }
        });

        r5c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c1ActionPerformed(evt);
            }
        });

        r6c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c1ActionPerformed(evt);
            }
        });

        r5c2.setBackground(new java.awt.Color(102, 153, 255));
        r5c2.setText("3");
        r5c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c2ActionPerformed(evt);
            }
        });

        r5c3.setBackground(new java.awt.Color(102, 153, 255));
        r5c3.setText("4");
        r5c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c3ActionPerformed(evt);
            }
        });

        r6c2.setBackground(new java.awt.Color(102, 153, 255));
        r6c2.setText("6");
        r6c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c2ActionPerformed(evt);
            }
        });

        r6c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(r5c1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r4c1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(r6c1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r4c2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r6c2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(r5c2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(r5c3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(r4c3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r6c3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r4c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(r4c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r4c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r5c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r5c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(r5c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r6c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Selection1.setBackground(new java.awt.Color(51, 51, 255));
        Selection1.setForeground(new java.awt.Color(255, 255, 255));
        Selection1.setText("1");
        Selection1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selection1ActionPerformed(evt);
            }
        });

        Selection2.setBackground(new java.awt.Color(153, 153, 153));
        Selection2.setForeground(new java.awt.Color(255, 255, 255));
        Selection2.setText("2");
        Selection2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selection2ActionPerformed(evt);
            }
        });

        Selection3.setBackground(new java.awt.Color(153, 153, 153));
        Selection3.setForeground(new java.awt.Color(255, 255, 255));
        Selection3.setText("3");
        Selection3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selection3ActionPerformed(evt);
            }
        });

        Selection4.setBackground(new java.awt.Color(153, 153, 153));
        Selection4.setForeground(new java.awt.Color(255, 255, 255));
        Selection4.setText("4");
        Selection4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selection4ActionPerformed(evt);
            }
        });

        Selection5.setBackground(new java.awt.Color(153, 153, 153));
        Selection5.setForeground(new java.awt.Color(255, 255, 255));
        Selection5.setText("5");
        Selection5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selection5ActionPerformed(evt);
            }
        });

        Selection6.setBackground(new java.awt.Color(153, 153, 153));
        Selection6.setForeground(new java.awt.Color(255, 255, 255));
        Selection6.setText("6");
        Selection6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selection6ActionPerformed(evt);
            }
        });

        Selection7.setBackground(new java.awt.Color(153, 153, 153));
        Selection7.setForeground(new java.awt.Color(255, 255, 255));
        Selection7.setText("7");
        Selection7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selection7ActionPerformed(evt);
            }
        });

        Selection8.setBackground(new java.awt.Color(153, 153, 153));
        Selection8.setForeground(new java.awt.Color(255, 255, 255));
        Selection8.setText("8");
        Selection8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selection8ActionPerformed(evt);
            }
        });

        Selection9.setBackground(new java.awt.Color(153, 153, 153));
        Selection9.setForeground(new java.awt.Color(255, 255, 255));
        Selection9.setText("9");
        Selection9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selection9ActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(102, 255, 204));
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        solvebtn.setBackground(new java.awt.Color(255, 153, 255));
        solvebtn.setText("SOLVE");
        solvebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solvebtnActionPerformed(evt);
            }
        });

        checkbtn.setBackground(new java.awt.Color(153, 153, 255));
        checkbtn.setForeground(new java.awt.Color(51, 0, 51));
        checkbtn.setText("CHECK MOVES");
        checkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbtnActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 102, 102));
        exitbtn.setText("EXIT");
        exitbtn.setActionCommand("RESET");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(exitbtn)
                                    .addGap(37, 37, 37)
                                    .addComponent(resetbtn)))
                            .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Selection7)
                                        .addGap(24, 24, 24)
                                        .addComponent(Selection8)
                                        .addGap(18, 18, 18)
                                        .addComponent(Selection9))
                                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Selection4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Selection5)
                                        .addGap(18, 18, 18)
                                        .addComponent(Selection6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(solvebtn)
                                        .addGap(79, 79, 79)
                                        .addComponent(checkbtn))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Selection1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Selection2)
                        .addGap(22, 22, 22)
                        .addComponent(Selection3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Selection4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Selection9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Selection8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Selection7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Selection3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Selection2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Selection1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Selection5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Selection6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solvebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r2c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_r2c1ActionPerformed

    private void r2c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c4ActionPerformed
        // TODO add your handling code here:
        r2c4.setText(turn);
        r2c4.setBackground(white);
    }//GEN-LAST:event_r2c4ActionPerformed

    private void r2c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c7ActionPerformed

    private void r5c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c7ActionPerformed

    private void r5c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c4ActionPerformed
        // TODO add your handling code here:
        r5c4.setText(turn);
        r5c4.setBackground(white);
    }//GEN-LAST:event_r5c4ActionPerformed

    private void r8c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r8c1ActionPerformed

    private void r8c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c7ActionPerformed
        // TODO add your handling code here:
        r8c7.setText(turn);
        r8c7.setBackground(white);
    }//GEN-LAST:event_r8c7ActionPerformed

    private void r8c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r8c4ActionPerformed

    private void r5c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c1ActionPerformed
        // TODO add your handling code here:
        r5c1.setText(turn);
        r5c1.setBackground(white);
    }//GEN-LAST:event_r5c1ActionPerformed

    private void Selection2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selection2ActionPerformed
        // TODO add your handling code here:
         Assignturn( Selection2);
        turn = "2";
    }//GEN-LAST:event_Selection2ActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame( "Reset");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to reset the game ","Sudoku Puzzle",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            ResetGame();
        }
    }//GEN-LAST:event_resetbtnActionPerformed

    private void solvebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solvebtnActionPerformed
        // TODO add your handling code here:
        SeeSolution();
    }//GEN-LAST:event_solvebtnActionPerformed

    private void checkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbtnActionPerformed
        // TODO add your handling code here:
        Checkmoves();
        
    }//GEN-LAST:event_checkbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
         JFrame frame = new JFrame( "Exit");
        if(JOptionPane.showConfirmDialog(frame, "You really want to exit!","Sudoku Puzzle",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitbtnActionPerformed

    private void r1c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c1ActionPerformed
        // TODO add your handling code here:
        r1c1.setText(turn);
        r1c1.setBackground(white); 
    }//GEN-LAST:event_r1c1ActionPerformed

    private void r1c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r1c4ActionPerformed

    private void r2c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c5ActionPerformed

    private void r3c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r3c5ActionPerformed

    private void r3c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r3c3ActionPerformed

    private void r3c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r3c1ActionPerformed

    private void r2c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c6ActionPerformed

    private void r1c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r1c7ActionPerformed

    private void r1c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r1c9ActionPerformed

    private void r1c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r1c8ActionPerformed

    private void r2c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c9ActionPerformed

    private void r3c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r3c8ActionPerformed

    private void r5c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c2ActionPerformed

    private void r6c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r6c2ActionPerformed

    private void r5c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c3ActionPerformed

    private void r6c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r6c4ActionPerformed

    private void r6c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r6c5ActionPerformed

    private void r4c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r4c5ActionPerformed

    private void r4c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r4c6ActionPerformed

    private void r5c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c8ActionPerformed

    private void r4c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c9ActionPerformed
        // TODO add your handling code here:
        r4c9.setText(turn);
        r4c9.setBackground(white);
    }//GEN-LAST:event_r4c9ActionPerformed

    private void r4c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r4c8ActionPerformed

    private void r7c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r7c2ActionPerformed

    private void r9c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c1ActionPerformed

    private void r9c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c2ActionPerformed

    private void r9c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c3ActionPerformed

    private void r7c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r7c5ActionPerformed

    private void r8c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r8c5ActionPerformed

    private void r9c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c6ActionPerformed

    private void r7c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r7c7ActionPerformed

    private void r7c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r7c9ActionPerformed

    private void r8c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is alreay allocated", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r8c9ActionPerformed

    private void r1c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c2ActionPerformed
        // TODO add your handling code here:
        r1c2.setText(turn);
        r1c2.setBackground(white); 
    }//GEN-LAST:event_r1c2ActionPerformed

    private void r1c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c3ActionPerformed
        // TODO add your handling code here:
        r1c3.setText(turn);
        r1c3.setBackground(white); 
    }//GEN-LAST:event_r1c3ActionPerformed

    private void r2c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c2ActionPerformed
        // TODO add your handling code here:
        r2c2.setText(turn);
        r2c2.setBackground(white); 
    }//GEN-LAST:event_r2c2ActionPerformed

    private void r2c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c3ActionPerformed
        // TODO add your handling code here:
        r2c3.setText(turn);
        r2c3.setBackground(white); 
    }//GEN-LAST:event_r2c3ActionPerformed

    private void r3c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c2ActionPerformed
        // TODO add your handling code here:
        r3c2.setText(turn);
        r3c2.setBackground(white); 
    }//GEN-LAST:event_r3c2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(turn);
        jButton1.setBackground(white); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void r1c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c6ActionPerformed
        // TODO add your handling code here:
       r1c6.setText(turn);
        r1c6.setBackground(white);
    }//GEN-LAST:event_r1c6ActionPerformed

    private void r2c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c8ActionPerformed
        // TODO add your handling code here:
        r2c8.setText(turn);
        r2c8.setBackground(white);
    }//GEN-LAST:event_r2c8ActionPerformed

    private void r3c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c4ActionPerformed
        // TODO add your handling code here:
        r3c4.setText(turn);
        r3c4.setBackground(white);
    }//GEN-LAST:event_r3c4ActionPerformed

    private void r3c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c6ActionPerformed
        // TODO add your handling code here:
        r3c6.setText(turn);
        r3c6.setBackground(white);
    }//GEN-LAST:event_r3c6ActionPerformed

    private void r3c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c7ActionPerformed
        // TODO add your handling code here:
        r3c7.setText(turn);
        r3c7.setBackground(white);
    }//GEN-LAST:event_r3c7ActionPerformed

    private void r3c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c9ActionPerformed
        // TODO add your handling code here:
        r3c9.setText(turn);
        r3c9.setBackground(white);
    }//GEN-LAST:event_r3c9ActionPerformed

    private void r4c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c1ActionPerformed
        // TODO add your handling code here:
        r4c1.setText(turn);
        r4c1.setBackground(white);
    }//GEN-LAST:event_r4c1ActionPerformed

    private void r4c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c2ActionPerformed
        // TODO add your handling code here:
        r4c2.setText(turn);
        r4c2.setBackground(white);
    }//GEN-LAST:event_r4c2ActionPerformed

    private void r4c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c3ActionPerformed
        // TODO add your handling code here:
        r4c3.setText(turn);
        r4c3.setBackground(white);
    }//GEN-LAST:event_r4c3ActionPerformed

    private void r4c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c4ActionPerformed
        // TODO add your handling code here:
        r4c4.setText(turn);
        r4c4.setBackground(white);
    }//GEN-LAST:event_r4c4ActionPerformed

    private void r4c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c7ActionPerformed
        // TODO add your handling code here:
        r4c7.setText(turn);
        r4c7.setBackground(white);
    }//GEN-LAST:event_r4c7ActionPerformed

    private void c5r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5r4ActionPerformed
        // TODO add your handling code here:
        c5r4.setText(turn);
        c5r4.setBackground(white);
    }//GEN-LAST:event_c5r4ActionPerformed

    private void r5c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c6ActionPerformed
        // TODO add your handling code here:
        r5c6.setText(turn);
        r5c6.setBackground(white);
    }//GEN-LAST:event_r5c6ActionPerformed

    private void r5c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c9ActionPerformed
        // TODO add your handling code here:
        r5c9.setText(turn);
        r5c9.setBackground(white);
    }//GEN-LAST:event_r5c9ActionPerformed

    private void r6c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c1ActionPerformed
        // TODO add your handling code here:
        r6c1.setText(turn);
        r6c1.setBackground(white);
    }//GEN-LAST:event_r6c1ActionPerformed

    private void r6c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c3ActionPerformed
        // TODO add your handling code here:
        r6c3.setText(turn);
        r6c3.setBackground(white);
    }//GEN-LAST:event_r6c3ActionPerformed

    private void r6c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c6ActionPerformed
        // TODO add your handling code here:
        r6c6.setText(turn);
        r6c6.setBackground(white);
    }//GEN-LAST:event_r6c6ActionPerformed

    private void r6c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c7ActionPerformed
        // TODO add your handling code here:
        r6c7.setText(turn);
        r6c7.setBackground(white);
    }//GEN-LAST:event_r6c7ActionPerformed

    private void r6c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c8ActionPerformed
        // TODO add your handling code here:
        r6c8.setText(turn);
        r6c8.setBackground(white);
    }//GEN-LAST:event_r6c8ActionPerformed

    private void r6c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c9ActionPerformed
        // TODO add your handling code here:
        r6c9.setText(turn);
        r6c9.setBackground(white);
    }//GEN-LAST:event_r6c9ActionPerformed

    private void r7c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c1ActionPerformed
        // TODO add your handling code here:
        r7c1.setText(turn);
        r7c1.setBackground(white);
    }//GEN-LAST:event_r7c1ActionPerformed

    private void r7c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c3ActionPerformed
        // TODO add your handling code here:
         r7c3.setText(turn);
        r7c3.setBackground(white);
    }//GEN-LAST:event_r7c3ActionPerformed

    private void r7c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c4ActionPerformed
        // TODO add your handling code here:
         r7c4.setText(turn);
        r7c4.setBackground(white);
    }//GEN-LAST:event_r7c4ActionPerformed

    private void r7c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c6ActionPerformed
        // TODO add your handling code here:
         r7c6.setText(turn);
        r7c6.setBackground(white);
    }//GEN-LAST:event_r7c6ActionPerformed

    private void r7c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c8ActionPerformed
        // TODO add your handling code here:
         r7c8.setText(turn);
        r7c8.setBackground(white);
    }//GEN-LAST:event_r7c8ActionPerformed

    private void r8c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c2ActionPerformed
        // TODO add your handling code here:
         r8c2.setText(turn);
        r8c2.setBackground(white);
    }//GEN-LAST:event_r8c2ActionPerformed

    private void r8c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c3ActionPerformed
        // TODO add your handling code here:
        r8c3.setText(turn);
        r8c3.setBackground(white);
    }//GEN-LAST:event_r8c3ActionPerformed

    private void r8c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c6ActionPerformed
        // TODO add your handling code here:
        r8c6.setText(turn);
        r8c6.setBackground(white);
    }//GEN-LAST:event_r8c6ActionPerformed

    private void r8c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c8ActionPerformed
        // TODO add your handling code here:
        r8c8.setText(turn);
        r8c8.setBackground(white);
    }//GEN-LAST:event_r8c8ActionPerformed

    private void r9c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c4ActionPerformed
        // TODO add your handling code here:
        r9c4.setText(turn);
        r9c4.setBackground(white);
    }//GEN-LAST:event_r9c4ActionPerformed

    private void r9c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c5ActionPerformed
        // TODO add your handling code here:3
        r9c5.setText(turn);
        r9c5.setBackground(white);
    }//GEN-LAST:event_r9c5ActionPerformed

    private void r9c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c7ActionPerformed
        // TODO add your handling code here:
        r9c7.setText(turn);
        r9c7.setBackground(white);
    }//GEN-LAST:event_r9c7ActionPerformed

    private void r9c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c8ActionPerformed
        // TODO add your handling code here:
        r9c8.setText(turn);
        r9c8.setBackground(white);
    }//GEN-LAST:event_r9c8ActionPerformed

    private void r9c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c9ActionPerformed
        // TODO add your handling code here:
        r9c9.setText(turn);
        r9c9.setBackground(white);
    }//GEN-LAST:event_r9c9ActionPerformed

    private void Selection1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selection1ActionPerformed
        // TODO add your handling code here:
        Assignturn( Selection1);
        turn = "1";
    }//GEN-LAST:event_Selection1ActionPerformed

    private void Selection3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selection3ActionPerformed
        // TODO add your handling code here:
         Assignturn( Selection3);
        turn = "3";
    }//GEN-LAST:event_Selection3ActionPerformed

    private void Selection4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selection4ActionPerformed
        // TODO add your handling code here:
         Assignturn( Selection4);
        turn = "4";
    }//GEN-LAST:event_Selection4ActionPerformed

    private void Selection5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selection5ActionPerformed
        // TODO add your handling code here:
         Assignturn( Selection5);
        turn = "5";
    }//GEN-LAST:event_Selection5ActionPerformed

    private void Selection6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selection6ActionPerformed
        // TODO add your handling code here:
         Assignturn( Selection6);
        turn = "6";
    }//GEN-LAST:event_Selection6ActionPerformed

    private void Selection7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selection7ActionPerformed
        // TODO add your handling code here:
         Assignturn( Selection7);
        turn = "7";
    }//GEN-LAST:event_Selection7ActionPerformed

    private void Selection8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selection8ActionPerformed
        // TODO add your handling code here:
         Assignturn( Selection8);
        turn = "8";
    }//GEN-LAST:event_Selection8ActionPerformed

    private void Selection9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selection9ActionPerformed
        // TODO add your handling code here:
         Assignturn( Selection9);
        turn = "9";
    }//GEN-LAST:event_Selection9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Selection1;
    private javax.swing.JButton Selection2;
    private javax.swing.JButton Selection3;
    private javax.swing.JButton Selection4;
    private javax.swing.JButton Selection5;
    private javax.swing.JButton Selection6;
    private javax.swing.JButton Selection7;
    private javax.swing.JButton Selection8;
    private javax.swing.JButton Selection9;
    private javax.swing.JButton c5r4;
    private javax.swing.JButton checkbtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton r1c1;
    private javax.swing.JButton r1c2;
    private javax.swing.JButton r1c3;
    private javax.swing.JButton r1c4;
    private javax.swing.JButton r1c5;
    private javax.swing.JButton r1c6;
    private javax.swing.JButton r1c7;
    private javax.swing.JButton r1c8;
    private javax.swing.JButton r1c9;
    private javax.swing.JButton r2c1;
    private javax.swing.JButton r2c2;
    private javax.swing.JButton r2c3;
    private javax.swing.JButton r2c4;
    private javax.swing.JButton r2c5;
    private javax.swing.JButton r2c6;
    private javax.swing.JButton r2c7;
    private javax.swing.JButton r2c8;
    private javax.swing.JButton r2c9;
    private javax.swing.JButton r3c1;
    private javax.swing.JButton r3c2;
    private javax.swing.JButton r3c3;
    private javax.swing.JButton r3c4;
    private javax.swing.JButton r3c5;
    private javax.swing.JButton r3c6;
    private javax.swing.JButton r3c7;
    private javax.swing.JButton r3c8;
    private javax.swing.JButton r3c9;
    private javax.swing.JButton r4c1;
    private javax.swing.JButton r4c2;
    private javax.swing.JButton r4c3;
    private javax.swing.JButton r4c4;
    private javax.swing.JButton r4c5;
    private javax.swing.JButton r4c6;
    private javax.swing.JButton r4c7;
    private javax.swing.JButton r4c8;
    private javax.swing.JButton r4c9;
    private javax.swing.JButton r5c1;
    private javax.swing.JButton r5c2;
    private javax.swing.JButton r5c3;
    private javax.swing.JButton r5c4;
    private javax.swing.JButton r5c6;
    private javax.swing.JButton r5c7;
    private javax.swing.JButton r5c8;
    private javax.swing.JButton r5c9;
    private javax.swing.JButton r6c1;
    private javax.swing.JButton r6c2;
    private javax.swing.JButton r6c3;
    private javax.swing.JButton r6c4;
    private javax.swing.JButton r6c5;
    private javax.swing.JButton r6c6;
    private javax.swing.JButton r6c7;
    private javax.swing.JButton r6c8;
    private javax.swing.JButton r6c9;
    private javax.swing.JButton r7c1;
    private javax.swing.JButton r7c2;
    private javax.swing.JButton r7c3;
    private javax.swing.JButton r7c4;
    private javax.swing.JButton r7c5;
    private javax.swing.JButton r7c6;
    private javax.swing.JButton r7c7;
    private javax.swing.JButton r7c8;
    private javax.swing.JButton r7c9;
    private javax.swing.JButton r8c1;
    private javax.swing.JButton r8c2;
    private javax.swing.JButton r8c3;
    private javax.swing.JButton r8c4;
    private javax.swing.JButton r8c5;
    private javax.swing.JButton r8c6;
    private javax.swing.JButton r8c7;
    private javax.swing.JButton r8c8;
    private javax.swing.JButton r8c9;
    private javax.swing.JButton r9c1;
    private javax.swing.JButton r9c2;
    private javax.swing.JButton r9c3;
    private javax.swing.JButton r9c4;
    private javax.swing.JButton r9c5;
    private javax.swing.JButton r9c6;
    private javax.swing.JButton r9c7;
    private javax.swing.JButton r9c8;
    private javax.swing.JButton r9c9;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton solvebtn;
    // End of variables declaration//GEN-END:variables

   
}
