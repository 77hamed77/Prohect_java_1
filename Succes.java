
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Succes extends javax.swing.JFrame{

    String gender;
    String filename = null;
    byte[] person_image;

    
    public Succes() {
        this.person_image = null;
        initComponents();
        show_user();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    public ArrayList<User> userList() {
        ArrayList<User> usersList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=ProjectJavaSwingUniversity;integratedSecurity=true;encrypt=false";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM users";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            User user;
            while (rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("name"), rs.getString("address"), rs.getString("gender"), rs.getString("knowledge"), rs.getString("subject"), rs.getBytes("images"), rs.getString("number"));
                usersList.add(user);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return usersList;
    }

    public void show_user() {
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getid();
            row[1] = list.get(i).getname();
            row[2] = list.get(i).getaddress();
            row[3] = list.get(i).getgender();
            row[4] = list.get(i).getknowledge();
            row[5] = list.get(i).getsubject();
            row[6] = list.get(i).getNumber();
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        id = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchdata = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        jCheckBox5 = new javax.swing.JCheckBox();
        subject = new javax.swing.JComboBox<>();
        jCheckBox6 = new javax.swing.JCheckBox();
        python = new javax.swing.JCheckBox();
        female = new javax.swing.JRadioButton();
        jCheckBox7 = new javax.swing.JCheckBox();
        corejava = new javax.swing.JCheckBox();
        male = new javax.swing.JRadioButton();
        resetBtn = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        deleteBtn = new javax.swing.JButton();
        jCheckBox3 = new javax.swing.JCheckBox();
        updateBtn = new javax.swing.JButton();
        jCheckBox4 = new javax.swing.JCheckBox();
        lbl_img = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnImage = new javax.swing.JButton();
        all = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(44, 62, 80));
        setResizable(false);

        id.setPreferredSize(new java.awt.Dimension(1, 1));
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Al-Khair platform for teaching programming");
        jLabel4.setPreferredSize(new java.awt.Dimension(1000, 50));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setPreferredSize(new java.awt.Dimension(1040, 500));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(44, 62, 80));
        jTable1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(248, 148, 6));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address", "Gender", "Courses", "Levels", "Fone Number"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(248, 148, 6));
        jTable1.setSelectionBackground(new java.awt.Color(248, 148, 6));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        searchdata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchdataKeyReleased(evt);
            }
        });

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(34, 167, 240));
        saveBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jCheckBox5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("PHP");

        subject.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LEVEL-1", "LEVEL-2", "LEVEL-3", "LEVEL-4", "LEVEL-5" }));
        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });

        jCheckBox6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("SQL-server");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        python.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        python.setForeground(new java.awt.Color(255, 255, 255));
        python.setText("Python");

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");

        jCheckBox7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("C++");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        corejava.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        corejava.setForeground(new java.awt.Color(255, 255, 255));
        corejava.setText("Java");

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");

        resetBtn.setBackground(new java.awt.Color(242, 38, 19));
        resetBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        resetBtn.setText("Resert");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("C#");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("HTML");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(242, 38, 19));
        deleteBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("CSS");

        updateBtn.setBackground(new java.awt.Color(255, 204, 51));
        updateBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("JavaScript");

        lbl_img.setBackground(new java.awt.Color(204, 204, 204));
        lbl_img.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(248, 148, 6), new java.awt.Color(248, 148, 6), new java.awt.Color(248, 148, 6), new java.awt.Color(248, 148, 6)));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Search");

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("fhone number");

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("gender");

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("name");

        jLabel13.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("course");

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Address");

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("levels");

        btnImage.setBackground(new java.awt.Color(255, 204, 51));
        btnImage.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        btnImage.setText("Choose");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        all.setBackground(new java.awt.Color(255, 204, 51));
        all.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        all.setText("all setudent");
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel15))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                        .addComponent(corejava)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(python)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox2)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(male)
                                                .addGap(18, 18, 18)
                                                .addComponent(female)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(saveBtn)
                                                .addGap(38, 38, 38)))))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCheckBox3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox5)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(updateBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deleteBtn)
                                        .addGap(34, 34, 34)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox6)
                                    .addComponent(resetBtn)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(searchdata, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(all)
                                .addGap(18, 18, 18)
                                .addComponent(btnImage)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(all, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox7)
                            .addComponent(python)
                            .addComponent(corejava)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(female)
                            .addComponent(male)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(947, 947, 947)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        id.setText(model.getValueAt(i, 0).toString());
        name.setText(model.getValueAt(i, 1).toString());
        address.setText(model.getValueAt(i, 2).toString());
        String sex = model.getValueAt(i, 3).toString();
        if (sex.equals("Male")) {
            male.setSelected(true);
            female.setSelected(false);
        } else {
            female.setSelected(true);
            male.setSelected(false);
        }
        String knowledge = model.getValueAt(i, 4).toString();
        switch (knowledge) {
            case "Java ":
                corejava.setSelected(true);
                python.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                break;
            case "Python ":
                corejava.setSelected(false);
                python.setSelected(true);
                jCheckBox7.setSelected(false);
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                break;
            case "C++ ":
                corejava.setSelected(false);
                python.setSelected(false);
                jCheckBox7.setSelected(true);
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                break;
            case "C# ":
                corejava.setSelected(false);
                python.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox1.setSelected(true);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                break;
            case "HTML ":
                corejava.setSelected(false);
                python.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(true);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                break;
            case "CSS ":
                corejava.setSelected(false);
                python.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(true);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                break;
            case "JavaScript ":
                corejava.setSelected(false);
                python.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(true);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                break;
            case "PHP":
                corejava.setSelected(false);
                python.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(true);
                jCheckBox6.setSelected(false);
                break;
            case "SQL-server":
                corejava.setSelected(false);
                python.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(true);
                break;
            default:
                corejava.setSelected(false);
                python.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                break;
        }//
        String subject1 = model.getValueAt(i, 5).toString();
        switch (subject1) {
            case "LEVEL-1":
                subject.setSelectedIndex(0);
                break;
            case "LEVEL-2":
                subject.setSelectedIndex(1);
                break;
            case "LEVEL-3":
                subject.setSelectedIndex(2);
                break;
            case "LEVEL-4":
                subject.setSelectedIndex(3);
                break;
            case "LEVEL-5":
                subject.setSelectedIndex(4);
                break;
        }
        byte[] img = (userList().get(i).getImage());
        ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_SMOOTH));
        lbl_img.setIcon(imageicon);
        person_image = img;
        number.setText(model.getValueAt(i,6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_SMOOTH));
        lbl_img.setIcon(imageicon);
        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image = bos.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnImageActionPerformed

    private void searchdataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchdataKeyReleased
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=ProjectJavaSwingUniversity;integratedSecurity=true;encrypt=false";
            Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM users WHERE id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, searchdata.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String setid = rs.getString("id");
                id.setText(setid);
                String setname = rs.getString("name");
                name.setText(setname);
                String setaddress = rs.getString("address");
                address.setText(setaddress);
                String sex = rs.getString("gender");
                if (sex.equals("Male")) {
                    male.setSelected(true);
                } else {
                    female.setSelected(true);
                }
                String knowledge = rs.getString("knowledge");
                switch (knowledge) {
                    case "Java ":
                        corejava.setSelected(true);
                        python.setSelected(false);
                        jCheckBox7.setSelected(false);
                        jCheckBox1.setSelected(false);
                        jCheckBox2.setSelected(false);
                        jCheckBox3.setSelected(false);
                        jCheckBox4.setSelected(false);
                        jCheckBox5.setSelected(false);
                        jCheckBox6.setSelected(false);
                        break;
                    case "Python ":
                        corejava.setSelected(false);
                        python.setSelected(true);
                        jCheckBox7.setSelected(false);
                        jCheckBox1.setSelected(false);
                        jCheckBox2.setSelected(false);
                        jCheckBox3.setSelected(false);
                        jCheckBox4.setSelected(false);
                        jCheckBox5.setSelected(false);
                        jCheckBox6.setSelected(false);
                        break;
                    case "C++ ":
                        corejava.setSelected(false);
                        python.setSelected(false);
                        jCheckBox7.setSelected(true);
                        jCheckBox1.setSelected(false);
                        jCheckBox2.setSelected(false);
                        jCheckBox3.setSelected(false);
                        jCheckBox4.setSelected(false);
                        jCheckBox5.setSelected(false);
                        jCheckBox6.setSelected(false);
                        break;
                    case "C# ":
                        corejava.setSelected(false);
                        python.setSelected(false);
                        jCheckBox7.setSelected(false);
                        jCheckBox1.setSelected(true);
                        jCheckBox2.setSelected(false);
                        jCheckBox3.setSelected(false);
                        jCheckBox4.setSelected(false);
                        jCheckBox5.setSelected(false);
                        jCheckBox6.setSelected(false);
                        break;
                    case "HTML ":
                        corejava.setSelected(false);
                        python.setSelected(false);
                        jCheckBox7.setSelected(false);
                        jCheckBox1.setSelected(false);
                        jCheckBox2.setSelected(true);
                        jCheckBox3.setSelected(false);
                        jCheckBox4.setSelected(false);
                        jCheckBox5.setSelected(false);
                        jCheckBox6.setSelected(false);
                        break;
                    case "CSS ":
                        corejava.setSelected(false);
                        python.setSelected(false);
                        jCheckBox7.setSelected(false);
                        jCheckBox1.setSelected(false);
                        jCheckBox2.setSelected(false);
                        jCheckBox3.setSelected(true);
                        jCheckBox4.setSelected(false);
                        jCheckBox5.setSelected(false);
                        jCheckBox6.setSelected(false);
                        break;
                    case "JavaScript ":
                        corejava.setSelected(false);
                        python.setSelected(false);
                        jCheckBox7.setSelected(false);
                        jCheckBox1.setSelected(false);
                        jCheckBox2.setSelected(false);
                        jCheckBox3.setSelected(false);
                        jCheckBox4.setSelected(true);
                        jCheckBox5.setSelected(false);
                        jCheckBox6.setSelected(false);
                        break;
                    case "PHP":
                        corejava.setSelected(false);
                        python.setSelected(false);
                        jCheckBox7.setSelected(false);
                        jCheckBox1.setSelected(false);
                        jCheckBox2.setSelected(false);
                        jCheckBox3.setSelected(false);
                        jCheckBox4.setSelected(false);
                        jCheckBox5.setSelected(true);
                        jCheckBox6.setSelected(false);
                        break;
                    case "SQL-server":
                        corejava.setSelected(false);
                        python.setSelected(false);
                        jCheckBox7.setSelected(false);
                        jCheckBox1.setSelected(false);
                        jCheckBox2.setSelected(false);
                        jCheckBox3.setSelected(false);
                        jCheckBox4.setSelected(false);
                        jCheckBox5.setSelected(false);
                        jCheckBox6.setSelected(true);
                        break;
                    default:
                        corejava.setSelected(false);
                        python.setSelected(false);
                        jCheckBox7.setSelected(false);
                        jCheckBox1.setSelected(false);
                        jCheckBox2.setSelected(false);
                        jCheckBox3.setSelected(false);
                        jCheckBox4.setSelected(false);
                        jCheckBox5.setSelected(false);
                        jCheckBox6.setSelected(false);
                        break;

                }
                String subject1 = rs.getString("subject");
                switch (subject1) {
                    case "LEVEL-1":
                        subject.setSelectedIndex(0);
                        break;
                    case "LEVEL-2":
                        subject.setSelectedIndex(1);
                        break;
                    case "LEVEL-3":
                        subject.setSelectedIndex(2);
                        break;
                    case "LEVEL-4":
                        subject.setSelectedIndex(3);
                        break;
                    case "LEVEL-5":
                        subject.setSelectedIndex(4);
                        break;
                }
                byte[] img = rs.getBytes("images");
                ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_SMOOTH));
                lbl_img.setIcon(imageicon);
                person_image = img;
                String setnumber = rs.getString("number");
                number.setText(setnumber);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchdataKeyReleased

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int opt = JOptionPane.showConfirmDialog(null, "Are you Delete ?", "DELETE", JOptionPane.YES_NO_OPTION);
        if (opt == 0) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=ProjectJavaSwingUniversity;integratedSecurity=true;encrypt=false";
                Connection con = DriverManager.getConnection(url);
                int row = jTable1.getSelectedRow();
                String value = (jTable1.getModel().getValueAt(row, 0).toString());
                String query = "DELETE FROM users WHERE id=" + value;
                PreparedStatement pst = con.prepareStatement(query);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                show_user();
                JOptionPane.showMessageDialog(null, "Delete Sucssefully!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=ProjectJavaSwingUniversity;integratedSecurity=true;encrypt=false";
            Connection con = DriverManager.getConnection(url);
            //            int row = jTable1.getSelectedRow();
            //            String value = (jTable1.getModel().getValueAt(row, 0).toString());
            String value = id.getText();
            String query = "UPDATE users SET name=? , address=?, gender=? , knowledge=? , subject=? ,images=?,number=? where id=" + value;
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name.getText());
            pst.setString(2, address.getText());
            if (male.isSelected()) {
                gender = "Male";
            }
            if (female.isSelected()) {
                gender = "Female";
            }
            pst.setString(3, gender);
            String Knowledge = "";
            if (corejava.isSelected()) {
                Knowledge += corejava.getText() + " ";
            }
            else if (python.isSelected()) {
                Knowledge += python.getText() + " ";
            }
            else if (jCheckBox7.isSelected()) {
                Knowledge += jCheckBox7.getText() + " ";
            }
            else if (jCheckBox1.isSelected()) {
                Knowledge += jCheckBox1.getText() + " ";
            }
            else if (jCheckBox2.isSelected()) {
                Knowledge += jCheckBox2.getText() + " ";
            }
            else if (jCheckBox3.isSelected()) {
                Knowledge += jCheckBox3.getText() + " ";
            }
            else if (jCheckBox4.isSelected()) {
                Knowledge += jCheckBox4.getText() + " ";
            }
            else if (jCheckBox5.isSelected()) {
                Knowledge += jCheckBox5.getText() + " ";
            }
            else if (jCheckBox6.isSelected()) {
                Knowledge += jCheckBox6.getText() + " ";
            }
            pst.setString(4, Knowledge);
            String course;
            course = subject.getSelectedItem().toString();
            pst.setString(5, course);
            byte[] img = person_image;
            pst.setBytes(6, img);
            pst.setString(7, number.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "Updated Sucssefully!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//هاد بيوصل القاعدة بال jdbc 
            String url = "jdbc:sqlserver://localhost:1433;databaseName=ProjectJavaSwingUniversity;integratedSecurity=true;encrypt=false";//هاد تعليمة الربط بالقاعدة 
            Connection con = DriverManager.getConnection(url);//اإتصال بالقاعدة
            String query = "insert into users(name,address,gender,knowledge,subject,images,number) values(?,?,?,?,?,?,?)";// حسب إلي بدك إضافة او نعديل او حذف 
            PreparedStatement pst = con.prepareStatement(query); //هاد بيدخل على القاعدة وبينفذ التعليمة المررة له
            pst.setString(1, name.getText());// هون انهخود من الصندوق الكتابة إلي دخله المستخدم وضيفه لأول عمود بالقاعدة 
            pst.setString(2, address.getText());// وهون كذلك بس ضيف العنوان لتاني عمود 
            if (male.isSelected()) {
                gender = "Male";
            }
            if (female.isSelected()) {
                gender = "Female";
            }
            pst.setString(3, gender);
            String Knowledge = "";
            if (corejava.isSelected()) {
                Knowledge += corejava.getText() + " ";
            }
           else if (python.isSelected()) {
                Knowledge += python.getText() + " ";
            }
           else if (jCheckBox7.isSelected()) {
                Knowledge += jCheckBox7.getText() + " ";
            }
           else if (jCheckBox1.isSelected()) {
                Knowledge += jCheckBox1.getText() + " ";
            }
           else if (jCheckBox2.isSelected()) {
                Knowledge += jCheckBox2.getText() + " ";
            }
           else if (jCheckBox3.isSelected()) {
                Knowledge += jCheckBox3.getText() + " ";
            }
           else if (jCheckBox4.isSelected()) {
                Knowledge += jCheckBox4.getText() + " ";
            }
           else if (jCheckBox5.isSelected()) {
                Knowledge += jCheckBox5.getText() + " ";
            }
           else if (jCheckBox6.isSelected()) {
                Knowledge += jCheckBox6.getText() + " ";
            }
            pst.setString(4, Knowledge);
            String course;
            course = subject.getSelectedItem().toString();
            pst.setString(5, course);
            pst.setBytes(6, person_image);
            pst.setString(7, number.getText());
            pst.executeUpdate();//delete ,update ,insert
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "Inserted Sucssefully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        name.setText("");
        address.setText("");
        buttonGroup1.clearSelection();
        subject.setSelectedIndex(0);
        corejava.setSelected(false);
        python.setSelected(false);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        lbl_img.setIcon(null);
        id.setText("");
        searchdata.setText("");
        number.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_idKeyReleased

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectActionPerformed

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        // TODO add your handling code here:
        try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=ProjectJavaSwingUniversity;integratedSecurity=true;encrypt=false";
                Connection con = DriverManager.getConnection(url);
                int row = jTable1.getSelectedRow();
//                String value = (jTable1.getModel().getValueAt(row, 0).toString());
                String query = "SELECT COUNT(*) FROM users";
                PreparedStatement pst = con.prepareStatement(query);
                pst.executeQuery();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int object = model.getRowCount();
//                show_user();
                JOptionPane.showMessageDialog(null, "Total of students : "+object);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        
    }//GEN-LAST:event_allActionPerformed

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
            java.util.logging.Logger.getLogger(Succes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Succes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Succes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Succes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Succes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton all;
    private javax.swing.JButton btnImage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox corejava;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField id;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JCheckBox python;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField searchdata;
    private javax.swing.JComboBox<String> subject;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
