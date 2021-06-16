
package Scientific_Calculate;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class Scientific_Calculator extends javax.swing.JFrame {
    double firstnum;
    double secondnum;
    double result;
    String operations;
    private Object math;
    
    public Scientific_Calculator() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton13 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jtxtDisplay = new javax.swing.JTextField();
        jbtn7 = new javax.swing.JButton();
        jbtnsqrt = new javax.swing.JButton();
        jbtnplus = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtndivide = new javax.swing.JButton();
        jbtnminus = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtndott = new javax.swing.JButton();
        jbtnplusminus = new javax.swing.JButton();
        jbtnequal = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnBackspace = new javax.swing.JButton();
        jbtnc = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtnmul = new javax.swing.JButton();
        jbtnLog = new javax.swing.JButton();
        jbtnSinh = new javax.swing.JButton();
        jbtnPi = new javax.swing.JButton();
        jbtnDiv1 = new javax.swing.JButton();
        jbtnCosh = new javax.swing.JButton();
        jbtnXY = new javax.swing.JButton();
        jbtnTan = new javax.swing.JButton();
        jbtnTanh = new javax.swing.JButton();
        jbtnXY2 = new javax.swing.JButton();
        jbtnSin = new javax.swing.JButton();
        jbtnCos = new javax.swing.JButton();
        jbtnXY3 = new javax.swing.JButton();
        jbtnBin = new javax.swing.JButton();
        jbtnHex = new javax.swing.JButton();
        jbtrSub3 = new javax.swing.JButton();
        jbtnMod = new javax.swing.JButton();
        jbtnOctal = new javax.swing.JButton();
        jbtnlnx = new javax.swing.JButton();
        jbtnexpo = new javax.swing.JButton();
        jbtnfloor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jButton13.setText("jButton1");

        jButton7.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDisplayKeyTyped(evt);
            }
        });

        jbtn7.setBackground(new java.awt.Color(0, 0, 0));
        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn7.setForeground(new java.awt.Color(255, 255, 0));
        jbtn7.setText("7");
        jbtn7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtnsqrt.setBackground(new java.awt.Color(0, 0, 0));
        jbtnsqrt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnsqrt.setForeground(new java.awt.Color(255, 255, 0));
        jbtnsqrt.setText("Sqrt");
        jbtnsqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsqrtActionPerformed(evt);
            }
        });

        jbtnplus.setBackground(new java.awt.Color(0, 0, 0));
        jbtnplus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnplus.setForeground(new java.awt.Color(255, 255, 0));
        jbtnplus.setText("+");
        jbtnplus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnplusActionPerformed(evt);
            }
        });

        jbtn4.setBackground(new java.awt.Color(0, 0, 0));
        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn4.setForeground(new java.awt.Color(255, 255, 0));
        jbtn4.setText("4");
        jbtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn3.setBackground(new java.awt.Color(0, 0, 0));
        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn3.setForeground(new java.awt.Color(255, 255, 0));
        jbtn3.setText("3");
        jbtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtndivide.setBackground(new java.awt.Color(0, 0, 0));
        jbtndivide.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtndivide.setForeground(new java.awt.Color(255, 255, 0));
        jbtndivide.setText("/");
        jbtndivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndivideActionPerformed(evt);
            }
        });

        jbtnminus.setBackground(new java.awt.Color(0, 0, 0));
        jbtnminus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnminus.setForeground(new java.awt.Color(255, 255, 0));
        jbtnminus.setText("-");
        jbtnminus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnminusActionPerformed(evt);
            }
        });

        jbtn1.setBackground(new java.awt.Color(0, 0, 0));
        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn1.setForeground(new java.awt.Color(255, 255, 0));
        jbtn1.setText("1");
        jbtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn2.setBackground(new java.awt.Color(0, 0, 0));
        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn2.setForeground(new java.awt.Color(255, 255, 0));
        jbtn2.setText("2");
        jbtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn8.setBackground(new java.awt.Color(0, 0, 0));
        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn8.setForeground(new java.awt.Color(255, 255, 0));
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn5.setBackground(new java.awt.Color(0, 0, 0));
        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn5.setForeground(new java.awt.Color(255, 255, 0));
        jbtn5.setText("5");
        jbtn5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn6.setBackground(new java.awt.Color(0, 0, 0));
        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn6.setForeground(new java.awt.Color(255, 255, 0));
        jbtn6.setText("6");
        jbtn6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtndott.setBackground(new java.awt.Color(0, 0, 0));
        jbtndott.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtndott.setForeground(new java.awt.Color(255, 255, 0));
        jbtndott.setText(".");
        jbtndott.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndottActionPerformed(evt);
            }
        });

        jbtnplusminus.setBackground(new java.awt.Color(0, 0, 0));
        jbtnplusminus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnplusminus.setForeground(new java.awt.Color(255, 255, 0));
        jbtnplusminus.setText("±");
        jbtnplusminus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnplusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnplusminusActionPerformed(evt);
            }
        });

        jbtnequal.setBackground(new java.awt.Color(0, 0, 0));
        jbtnequal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnequal.setForeground(new java.awt.Color(255, 255, 0));
        jbtnequal.setText("=");
        jbtnequal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnequalActionPerformed(evt);
            }
        });

        jbtn0.setBackground(new java.awt.Color(0, 0, 0));
        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn0.setForeground(new java.awt.Color(255, 255, 0));
        jbtn0.setText("0");
        jbtn0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtnBackspace.setBackground(new java.awt.Color(0, 0, 0));
        jbtnBackspace.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnBackspace.setForeground(new java.awt.Color(255, 255, 0));
        jbtnBackspace.setText("<-");
        jbtnBackspace.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackspaceActionPerformed(evt);
            }
        });

        jbtnc.setBackground(new java.awt.Color(0, 0, 0));
        jbtnc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnc.setForeground(new java.awt.Color(255, 255, 0));
        jbtnc.setText("C");
        jbtnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncActionPerformed(evt);
            }
        });

        jbtn9.setBackground(new java.awt.Color(0, 0, 0));
        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn9.setForeground(new java.awt.Color(255, 255, 0));
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtnmul.setBackground(new java.awt.Color(0, 0, 0));
        jbtnmul.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnmul.setForeground(new java.awt.Color(255, 255, 0));
        jbtnmul.setText("*");
        jbtnmul.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmulActionPerformed(evt);
            }
        });

        jbtnLog.setBackground(new java.awt.Color(0, 0, 0));
        jbtnLog.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnLog.setForeground(new java.awt.Color(255, 255, 0));
        jbtnLog.setText("Log");
        jbtnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogActionPerformed(evt);
            }
        });

        jbtnSinh.setBackground(new java.awt.Color(0, 0, 0));
        jbtnSinh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnSinh.setForeground(new java.awt.Color(255, 255, 0));
        jbtnSinh.setText("Sinh");
        jbtnSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinhActionPerformed(evt);
            }
        });

        jbtnPi.setBackground(new java.awt.Color(0, 0, 0));
        jbtnPi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnPi.setForeground(new java.awt.Color(255, 255, 0));
        jbtnPi.setText("Ԥ");
        jbtnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPiActionPerformed(evt);
            }
        });

        jbtnDiv1.setBackground(new java.awt.Color(0, 0, 0));
        jbtnDiv1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnDiv1.setForeground(new java.awt.Color(255, 255, 0));
        jbtnDiv1.setText("Cbrt");
        jbtnDiv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDiv1ActionPerformed(evt);
            }
        });

        jbtnCosh.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCosh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnCosh.setForeground(new java.awt.Color(255, 255, 0));
        jbtnCosh.setText("Cosh");
        jbtnCosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCoshActionPerformed(evt);
            }
        });

        jbtnXY.setBackground(new java.awt.Color(0, 0, 0));
        jbtnXY.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnXY.setForeground(new java.awt.Color(255, 255, 0));
        jbtnXY.setText("<html>\nx<sup>x</sup>\n</html>");
        jbtnXY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXYActionPerformed(evt);
            }
        });

        jbtnTan.setBackground(new java.awt.Color(0, 0, 0));
        jbtnTan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnTan.setForeground(new java.awt.Color(255, 255, 0));
        jbtnTan.setText("Tan");
        jbtnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTanActionPerformed(evt);
            }
        });

        jbtnTanh.setBackground(new java.awt.Color(0, 0, 0));
        jbtnTanh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnTanh.setForeground(new java.awt.Color(255, 255, 0));
        jbtnTanh.setText("Tanh");
        jbtnTanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTanhActionPerformed(evt);
            }
        });

        jbtnXY2.setBackground(new java.awt.Color(0, 0, 0));
        jbtnXY2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnXY2.setForeground(new java.awt.Color(255, 255, 0));
        jbtnXY2.setText("<html>\nx<sup>2</sup>\n</html>");
        jbtnXY2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXY2ActionPerformed(evt);
            }
        });

        jbtnSin.setBackground(new java.awt.Color(0, 0, 0));
        jbtnSin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnSin.setForeground(new java.awt.Color(255, 255, 0));
        jbtnSin.setText("Sin");
        jbtnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinActionPerformed(evt);
            }
        });

        jbtnCos.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnCos.setForeground(new java.awt.Color(255, 255, 0));
        jbtnCos.setText("Cos");
        jbtnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCosActionPerformed(evt);
            }
        });

        jbtnXY3.setBackground(new java.awt.Color(0, 0, 0));
        jbtnXY3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnXY3.setForeground(new java.awt.Color(255, 255, 0));
        jbtnXY3.setText("<html> x<sup>3</sup> </html>");
        jbtnXY3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXY3ActionPerformed(evt);
            }
        });

        jbtnBin.setBackground(new java.awt.Color(0, 0, 0));
        jbtnBin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnBin.setForeground(new java.awt.Color(255, 255, 0));
        jbtnBin.setText("Bin");
        jbtnBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBinActionPerformed(evt);
            }
        });

        jbtnHex.setBackground(new java.awt.Color(0, 0, 0));
        jbtnHex.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnHex.setForeground(new java.awt.Color(255, 255, 0));
        jbtnHex.setText("Hex");
        jbtnHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHexActionPerformed(evt);
            }
        });

        jbtrSub3.setBackground(new java.awt.Color(0, 0, 0));
        jbtrSub3.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jbtrSub3.setForeground(new java.awt.Color(255, 255, 0));
        jbtrSub3.setText("Round ");
        jbtrSub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtrSub3ActionPerformed(evt);
            }
        });

        jbtnMod.setBackground(new java.awt.Color(0, 0, 0));
        jbtnMod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnMod.setForeground(new java.awt.Color(255, 255, 0));
        jbtnMod.setText("Mod");
        jbtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModActionPerformed(evt);
            }
        });

        jbtnOctal.setBackground(new java.awt.Color(0, 0, 0));
        jbtnOctal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtnOctal.setForeground(new java.awt.Color(255, 255, 0));
        jbtnOctal.setText("octal");
        jbtnOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOctalActionPerformed(evt);
            }
        });

        jbtnlnx.setBackground(new java.awt.Color(0, 0, 0));
        jbtnlnx.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnlnx.setForeground(new java.awt.Color(255, 255, 0));
        jbtnlnx.setText("lnx");
        jbtnlnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlnxActionPerformed(evt);
            }
        });

        jbtnexpo.setBackground(new java.awt.Color(0, 0, 0));
        jbtnexpo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnexpo.setForeground(new java.awt.Color(255, 255, 0));
        jbtnexpo.setText("e^x"); // NOI18N
        jbtnexpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexpoActionPerformed(evt);
            }
        });

        jbtnfloor.setBackground(new java.awt.Color(0, 0, 0));
        jbtnfloor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnfloor.setForeground(new java.awt.Color(255, 255, 0));
        jbtnfloor.setText("//");
        jbtnfloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnfloorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Siddharth & Pratham");

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Scientific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnBackspace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtndott, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnplusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jbtndivide, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                        .addComponent(jbtnminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtnc, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(37, 37, 37))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jtxtDisplay)
                            .addGap(33, 33, 33)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnXY3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnBin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jbtnHex, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtnXY, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnTanh, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtnXY2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnDiv1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtrSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jbtnCosh, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jbtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbtnSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnlnx, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jbtnMod, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jbtnOctal, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jbtnexpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnfloor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPi, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jbtnCosh, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jbtnCos, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jbtnlnx, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnXY, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jbtnTan, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jbtnTanh, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jbtnexpo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnDiv1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtndivide, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnXY2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addComponent(jbtrSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnfloor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbtndott, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnplusminus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtn0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnequal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnBin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnXY3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnHex, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnOctal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        
        String iNum=jtxtDisplay.getText()+jbtn0.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        this.setResizable(true);
        this.setSize(320, 460);
    }//GEN-LAST:event_formWindowActivated

    private void jbtnBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBinActionPerformed
       
       int a=Integer.parseInt(jtxtDisplay.getText());
       jtxtDisplay.setText(Integer.toString(a,2));
    }//GEN-LAST:event_jbtnBinActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        // TODO add your handling code here:
        String iNum=jtxtDisplay.getText()+jbtn7.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        
        String iNum=jtxtDisplay.getText()+jbtn8.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        
        String iNum=jtxtDisplay.getText()+jbtn9.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        
        String iNum=jtxtDisplay.getText()+jbtn4.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        
        String iNum=jtxtDisplay.getText()+jbtn5.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        
        String iNum=jtxtDisplay.getText()+jbtn6.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        
        String iNum=jtxtDisplay.getText()+jbtn1.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        
        String iNum=jtxtDisplay.getText()+jbtn2.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        
        String iNum=jtxtDisplay.getText()+jbtn3.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncActionPerformed
        
        jtxtDisplay.setText("");
    }//GEN-LAST:event_jbtncActionPerformed

    private void jbtnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackspaceActionPerformed
        
        String bsp = null;
        
        if(jtxtDisplay.getText().length()>0)
        {
            StringBuilder strB= new StringBuilder(jtxtDisplay.getText());
            strB.deleteCharAt(jtxtDisplay.getText().length()-1);
            bsp=strB.toString();
            jtxtDisplay.setText(bsp);
        }
    }//GEN-LAST:event_jbtnBackspaceActionPerformed

    private void jbtndottActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndottActionPerformed
        
        if (!jtxtDisplay.getText().contains("."))
        {
            jtxtDisplay.setText(jtxtDisplay.getText()+jbtndott.getText());
            
        }
    }//GEN-LAST:event_jbtndottActionPerformed

    private void jbtnplusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnplusminusActionPerformed
        
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=ops*(-1);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnplusminusActionPerformed

    private void jbtnsqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsqrtActionPerformed
        
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.sqrt(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnsqrtActionPerformed

    private void jbtnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogActionPerformed
        
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.log(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnLogActionPerformed

    private void jbtnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSinActionPerformed
        
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.sin((Math.PI*ops)/180);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnSinActionPerformed

    private void jbtnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnplusActionPerformed
        
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations=("+");
    }//GEN-LAST:event_jbtnplusActionPerformed

    private void jbtnDiv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDiv1ActionPerformed
        
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.cbrt(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnDiv1ActionPerformed

    private void jbtnSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSinhActionPerformed
        
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.sinh(ops);
        jtxtDisplay.setText(String.valueOf(ops));
        
    }//GEN-LAST:event_jbtnSinhActionPerformed

    private void jbtnCoshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCoshActionPerformed
        
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.cosh(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnCoshActionPerformed

    private void jbtnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCosActionPerformed
       
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.cos((Math.PI*ops)/180);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnCosActionPerformed

    private void jbtnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTanActionPerformed
        
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.tan((Math.PI*ops)/180);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnTanActionPerformed

    private void jbtnTanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTanhActionPerformed
        
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.tanh(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnTanhActionPerformed

    private void jbtnPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPiActionPerformed
        
        double ops;
        ops=(3.1415926535897932384626433832795);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnPiActionPerformed

    private void jbtrSub3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtrSub3ActionPerformed
        
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.round(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtrSub3ActionPerformed

    private void jbtnXYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXYActionPerformed
        
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.pow(ops, ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnXYActionPerformed

    private void jbtnXY2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXY2ActionPerformed
        
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=(ops * ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnXY2ActionPerformed

    private void jbtnXY3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXY3ActionPerformed
        
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=(ops * ops * ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnXY3ActionPerformed

    private void jbtnHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHexActionPerformed
        
        int a= Integer.parseInt(jtxtDisplay.getText());
        jtxtDisplay.setText(Integer.toString(a, 16));
    }//GEN-LAST:event_jbtnHexActionPerformed

    private void jtxtDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDisplayKeyTyped
        
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtxtDisplayKeyTyped

    private void jbtnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnequalActionPerformed
        
        String answer;
        secondnum = Double.parseDouble(jtxtDisplay.getText());
        if(operations =="+")
        {
            result= firstnum + secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operations =="-")
        {
            result= firstnum - secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operations =="*")
        {
            result= firstnum * secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operations =="/")
        {
            result= firstnum / secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operations =="%")
        {
            result= firstnum % secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operations =="//")
        {
            result= (int)(firstnum / secondnum);
            answer = String.format("%.0f", result);
  
            jtxtDisplay.setText(answer);
        }
    }//GEN-LAST:event_jbtnequalActionPerformed

    private void jbtnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnminusActionPerformed
        
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations=("-");
    }//GEN-LAST:event_jbtnminusActionPerformed

    private void jbtnmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmulActionPerformed
        
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations=("*");
    }//GEN-LAST:event_jbtnmulActionPerformed

    private void jbtndivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndivideActionPerformed
       
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations=("/");
    }//GEN-LAST:event_jbtndivideActionPerformed

    private void jbtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModActionPerformed
       
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations=("%");
    }//GEN-LAST:event_jbtnModActionPerformed

    private void jbtnOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOctalActionPerformed
        
        int a= Integer.parseInt(jtxtDisplay.getText());
        jtxtDisplay.setText(Integer.toString(a, 8));
    }//GEN-LAST:event_jbtnOctalActionPerformed

    private void jbtnlnxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnlnxActionPerformed
      
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.log10(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnlnxActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        this.setResizable(true);
        this.setSize(630, 460);
        jtxtDisplay.setSize(575, 50);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        this.setResizable(true);
        this.setSize(312, 460);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jbtnexpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexpoActionPerformed
        
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.exp(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnexpoActionPerformed

    private void jbtnfloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnfloorActionPerformed
        
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations=("//");
    }//GEN-LAST:event_jbtnfloorActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scientific_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnBackspace;
    private javax.swing.JButton jbtnBin;
    private javax.swing.JButton jbtnCos;
    private javax.swing.JButton jbtnCosh;
    private javax.swing.JButton jbtnDiv1;
    private javax.swing.JButton jbtnHex;
    private javax.swing.JButton jbtnLog;
    private javax.swing.JButton jbtnMod;
    private javax.swing.JButton jbtnOctal;
    private javax.swing.JButton jbtnPi;
    private javax.swing.JButton jbtnSin;
    private javax.swing.JButton jbtnSinh;
    private javax.swing.JButton jbtnTan;
    private javax.swing.JButton jbtnTanh;
    private javax.swing.JButton jbtnXY;
    private javax.swing.JButton jbtnXY2;
    private javax.swing.JButton jbtnXY3;
    private javax.swing.JButton jbtnc;
    private javax.swing.JButton jbtndivide;
    private javax.swing.JButton jbtndott;
    private javax.swing.JButton jbtnequal;
    private javax.swing.JButton jbtnexpo;
    private javax.swing.JButton jbtnfloor;
    private javax.swing.JButton jbtnlnx;
    private javax.swing.JButton jbtnminus;
    private javax.swing.JButton jbtnmul;
    private javax.swing.JButton jbtnplus;
    private javax.swing.JButton jbtnplusminus;
    private javax.swing.JButton jbtnsqrt;
    private javax.swing.JButton jbtrSub3;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables
}
