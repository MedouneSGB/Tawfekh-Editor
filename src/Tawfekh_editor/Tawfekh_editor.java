package Tawfekh_editor;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;

/**
 * @author MSGB
 */
public class Tawfekh_editor extends javax.swing.JFrame implements ActionListener {

    public Tawfekh_editor() {

        initComponents();
        setIconImage();

        tableListener();

    }

    /**
     * Don't Remove
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGlobale = new javax.swing.JPanel();
        panelAccueil = new javax.swing.JPanel();
        btnNouveau = new javax.swing.JButton();
        btnParametre = new javax.swing.JButton();
        btnQuitter = new javax.swing.JButton();
        lblTitre = new javax.swing.JLabel();
        panelEditeur = new javax.swing.JPanel();
        panelColorChoose = new javax.swing.JPanel();
        btnColorBlack = new javax.swing.JButton();
        btnColorWhite = new javax.swing.JButton();
        btnColorRed = new javax.swing.JButton();
        btnColorYellow = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnSaveAs = new javax.swing.JButton();
        btnColor = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnCloseFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        panelFichiers = new javax.swing.JPanel();
        btnFichierOuvert1 = new javax.swing.JButton();
        btnFichierOuvert2 = new javax.swing.JButton();
        btnFichierOuvert3 = new javax.swing.JButton();
        lblSaveMessage = new javax.swing.JLabel();
        panelParametre = new javax.swing.JPanel();
        btnParamSave = new javax.swing.JButton();
        btnParamRetour = new javax.swing.JButton();
        txtChangeTitre = new javax.swing.JTextField();
        lblParamTitre = new javax.swing.JLabel();
        lblParamTheme = new javax.swing.JLabel();
        btnThemeClassique = new javax.swing.JButton();
        btnThemeBlack = new javax.swing.JButton();
        cbPolice = new javax.swing.JComboBox<>();
        lblParamPolice = new javax.swing.JLabel();
        btnUploadBg = new javax.swing.JButton();
        lblParamUpBG = new javax.swing.JLabel();
        lblSignature = new javax.swing.JLabel();
        btnThemePink = new javax.swing.JButton();
        imgBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tawfekh Editor 1.0");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(960, 678));
        setResizable(false);
        getContentPane().setLayout(null);

        panelGlobale.setLayout(null);

        panelAccueil.setOpaque(false);
        panelAccueil.setLayout(null);

        btnNouveau.setBackground(new java.awt.Color(138, 92, 1));
        btnNouveau.setFont(new java.awt.Font("Garamond", 2, 48)); // NOI18N
        btnNouveau.setForeground(new java.awt.Color(255, 255, 255));
        btnNouveau.setText("Nouveau Chef d'oeuvre");
        btnNouveau.setFocusPainted(false);
        btnNouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNouveauActionPerformed(evt);
            }
        });
        panelAccueil.add(btnNouveau);
        btnNouveau.setBounds(260, 211, 408, 61);

        btnParametre.setBackground(new java.awt.Color(153, 102, 0));
        btnParametre.setFont(new java.awt.Font("Garamond", 2, 48)); // NOI18N
        btnParametre.setForeground(new java.awt.Color(255, 255, 255));
        btnParametre.setText("Paramétres");
        btnParametre.setFocusPainted(false);
        btnParametre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParametreActionPerformed(evt);
            }
        });
        panelAccueil.add(btnParametre);
        btnParametre.setBounds(260, 301, 218, 61);

        btnQuitter.setBackground(new java.awt.Color(153, 102, 0));
        btnQuitter.setFont(new java.awt.Font("Garamond", 2, 48)); // NOI18N
        btnQuitter.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitter.setText("Quitter");
        btnQuitter.setFocusPainted(false);
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });
        panelAccueil.add(btnQuitter);
        btnQuitter.setBounds(504, 301, 164, 61);

        lblTitre.setFont(new java.awt.Font("Garamond", 2, 78)); // NOI18N
        lblTitre.setForeground(new java.awt.Color(153, 51, 0));
        lblTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitre.setText("Tawfekh Mémorial");
        lblTitre.setToolTipText("");
        lblTitre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelAccueil.add(lblTitre);
        lblTitre.setBounds(6, 0, 934, 100);

        panelGlobale.add(panelAccueil);
        panelAccueil.setBounds(10, 110, 940, 460);

        panelEditeur.setOpaque(false);
        panelEditeur.setLayout(null);

        panelColorChoose.setBackground(new java.awt.Color(255, 255, 255));
        panelColorChoose.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnColorBlack.setBackground(new java.awt.Color(0, 0, 0));
        btnColorBlack.setBorder(null);
        btnColorBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorBlackActionPerformed(evt);
            }
        });

        btnColorWhite.setBorder(null);
        btnColorWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorWhiteActionPerformed(evt);
            }
        });

        btnColorRed.setBackground(new java.awt.Color(255, 0, 0));
        btnColorRed.setBorder(null);
        btnColorRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorRedActionPerformed(evt);
            }
        });

        btnColorYellow.setBackground(new java.awt.Color(255, 204, 0));
        btnColorYellow.setBorder(null);
        btnColorYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorYellowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelColorChooseLayout = new javax.swing.GroupLayout(panelColorChoose);
        panelColorChoose.setLayout(panelColorChooseLayout);
        panelColorChooseLayout.setHorizontalGroup(
            panelColorChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColorChooseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnColorBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnColorWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnColorRed, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnColorYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelColorChooseLayout.setVerticalGroup(
            panelColorChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColorChooseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelColorChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnColorWhite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnColorBlack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnColorRed, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(btnColorYellow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelEditeur.add(panelColorChoose);
        panelColorChoose.setBounds(115, 40, 130, 40);
        panelColorChoose.setVisible(false);

        btnAdd.setBackground(new java.awt.Color(153, 102, 0));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/documents.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panelEditeur.add(btnAdd);
        btnAdd.setBounds(6, 4, 45, 45);

        btnOpen.setBackground(new java.awt.Color(153, 102, 0));
        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/folder(2).png"))); // NOI18N
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });
        panelEditeur.add(btnOpen);
        btnOpen.setBounds(56, 4, 45, 45);

        btnSave.setBackground(new java.awt.Color(153, 102, 0));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/diskette.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panelEditeur.add(btnSave);
        btnSave.setBounds(106, 4, 45, 45);

        btnSaveAs.setBackground(new java.awt.Color(153, 102, 0));
        btnSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save-file.png"))); // NOI18N
        btnSaveAs.setEnabled(false);
        panelEditeur.add(btnSaveAs);
        btnSaveAs.setBounds(256, 4, 45, 45);
        btnSaveAs.setVisible(false);

        btnColor.setBackground(new java.awt.Color(153, 102, 0));
        btnColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/colour.png"))); // NOI18N
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });
        panelEditeur.add(btnColor);
        btnColor.setBounds(156, 4, 45, 45);

        btnExit.setBackground(new java.awt.Color(153, 102, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        panelEditeur.add(btnExit);
        btnExit.setBounds(206, 4, 45, 45);

        btnCloseFile.setBackground(new java.awt.Color(153, 102, 0));
        btnCloseFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        btnCloseFile.setEnabled(false);
        btnCloseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseFileActionPerformed(evt);
            }
        });
        panelEditeur.add(btnCloseFile);
        btnCloseFile.setBounds(306, 4, 45, 45);
        btnCloseFile.setVisible(false);

        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setOpaque(false);
        jScrollPane1.setRowHeaderView(null);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Cormorant Garamond", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setSelectionColor(new java.awt.Color(153, 51, 0));
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.setBackground(new Color(255,255,255,60));

        panelEditeur.add(jScrollPane1);
        jScrollPane1.setBounds(149, 54, 830, 589);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setOpaque(false);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea2.setColumns(1);
        jTextArea2.setFont(new java.awt.Font("Cormorant Garamond", 0, 24)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("1");
        jScrollPane2.setViewportView(jTextArea2);
        jTextArea2.setBackground(new Color(255,255,255,60));
        jScrollPane1.setRowHeaderView(jTextArea2);

        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(null);

        panelEditeur.add(jScrollPane2);
        jScrollPane2.setBounds(150, 54, 40, 589);

        panelFichiers.setOpaque(false);
        panelFichiers.setPreferredSize(new java.awt.Dimension(37, 100));
        panelFichiers.setLayout(null);

        btnFichierOuvert1.setBackground(new java.awt.Color(153, 102, 0));
        btnFichierOuvert1.setFont(new java.awt.Font("Cormorant Garamond", 2, 23)); // NOI18N
        btnFichierOuvert1.setForeground(new java.awt.Color(255, 255, 255));
        btnFichierOuvert1.setText("New-file");
        btnFichierOuvert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichierOuvert1ActionPerformed(evt);
            }
        });
        panelFichiers.add(btnFichierOuvert1);
        btnFichierOuvert1.setBounds(0, 6, 140, 32);

        btnFichierOuvert2.setBackground(new java.awt.Color(153, 102, 0));
        btnFichierOuvert2.setFont(new java.awt.Font("Cormorant Garamond", 2, 23)); // NOI18N
        btnFichierOuvert2.setForeground(new java.awt.Color(255, 255, 255));
        btnFichierOuvert2.setText("New-file");
        btnFichierOuvert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichierOuvert2ActionPerformed(evt);
            }
        });
        panelFichiers.add(btnFichierOuvert2);
        btnFichierOuvert2.setBounds(0, 50, 140, 32);
        btnFichierOuvert2.setVisible(false);

        btnFichierOuvert3.setBackground(new java.awt.Color(153, 102, 0));
        btnFichierOuvert3.setFont(new java.awt.Font("Cormorant Garamond", 2, 23)); // NOI18N
        btnFichierOuvert3.setForeground(new java.awt.Color(255, 255, 255));
        btnFichierOuvert3.setText("New-file");
        btnFichierOuvert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichierOuvert3ActionPerformed(evt);
            }
        });
        panelFichiers.add(btnFichierOuvert3);
        btnFichierOuvert3.setBounds(0, 94, 140, 32);
        btnFichierOuvert3.setVisible(false);

        panelEditeur.add(panelFichiers);
        panelFichiers.setBounds(6, 54, 140, 589);

        lblSaveMessage.setFont(new java.awt.Font("Cormorant Garamond", 0, 36)); // NOI18N
        lblSaveMessage.setForeground(new java.awt.Color(153, 51, 0));
        lblSaveMessage.setText("Enregistré !");
        lblSaveMessage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblSaveMessageFocusLost(evt);
            }
        });
        panelEditeur.add(lblSaveMessage);
        lblSaveMessage.setBounds(430, 0, 160, 50);
        lblSaveMessage.setVisible(false);

        panelGlobale.add(panelEditeur);
        panelEditeur.setBounds(0, 0, 960, 660);
        panelEditeur.setVisible(false);

        panelParametre.setOpaque(false);
        panelParametre.setLayout(null);

        btnParamSave.setBackground(new java.awt.Color(153, 102, 0));
        btnParamSave.setFont(new java.awt.Font("Garamond", 2, 48)); // NOI18N
        btnParamSave.setForeground(new java.awt.Color(255, 255, 255));
        btnParamSave.setText("Enregistrer");
        btnParamSave.setFocusPainted(false);
        btnParamSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParamSaveActionPerformed(evt);
            }
        });
        panelParametre.add(btnParamSave);
        btnParamSave.setBounds(42, 317, 230, 61);

        btnParamRetour.setBackground(new java.awt.Color(153, 102, 0));
        btnParamRetour.setFont(new java.awt.Font("Garamond", 2, 48)); // NOI18N
        btnParamRetour.setForeground(new java.awt.Color(255, 255, 255));
        btnParamRetour.setText("Retour");
        btnParamRetour.setFocusPainted(false);
        btnParamRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParamRetourActionPerformed(evt);
            }
        });
        panelParametre.add(btnParamRetour);
        btnParamRetour.setBounds(296, 317, 170, 61);

        txtChangeTitre.setFont(new java.awt.Font("Cormorant Garamond", 0, 24)); // NOI18N
        panelParametre.add(txtChangeTitre);
        txtChangeTitre.setBounds(197, 41, 270, 39);
        txtChangeTitre.setText(lblTitre.getText());

        lblParamTitre.setFont(new java.awt.Font("Cormorant Garamond", 0, 36)); // NOI18N
        lblParamTitre.setText("Titre :");
        panelParametre.add(lblParamTitre);
        lblParamTitre.setBounds(40, 34, 150, 45);

        lblParamTheme.setFont(new java.awt.Font("Cormorant Garamond", 0, 36)); // NOI18N
        lblParamTheme.setText("Thème : ");
        panelParametre.add(lblParamTheme);
        lblParamTheme.setBounds(40, 100, 150, 47);

        btnThemeClassique.setBackground(new java.awt.Color(212, 161, 8));
        btnThemeClassique.setFont(new java.awt.Font("Cormorant Garamond", 0, 20)); // NOI18N
        btnThemeClassique.setForeground(new java.awt.Color(255, 255, 255));
        btnThemeClassique.setText("Classique");
        btnThemeClassique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemeClassiqueActionPerformed(evt);
            }
        });
        panelParametre.add(btnThemeClassique);
        btnThemeClassique.setBounds(197, 107, 105, 39);

        btnThemeBlack.setBackground(new java.awt.Color(0, 0, 0));
        btnThemeBlack.setFont(new java.awt.Font("Cormorant Garamond", 0, 20)); // NOI18N
        btnThemeBlack.setForeground(new java.awt.Color(255, 255, 255));
        btnThemeBlack.setText("Black");
        btnThemeBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemeBlackActionPerformed(evt);
            }
        });
        panelParametre.add(btnThemeBlack);
        btnThemeBlack.setBounds(307, 107, 78, 39);

        cbPolice.setBackground(new java.awt.Color(168, 111, 0));
        cbPolice.setFont(new java.awt.Font("Cormorant Garamond", 0, 24)); // NOI18N
        cbPolice.setForeground(new java.awt.Color(255, 255, 255));
        cbPolice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Garamond", "Cormorant Garamond", "Times New Roman" }));
        cbPolice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPoliceActionPerformed(evt);
            }
        });
        panelParametre.add(cbPolice);
        cbPolice.setBounds(197, 173, 270, 41);

        lblParamPolice.setFont(new java.awt.Font("Cormorant Garamond", 0, 36)); // NOI18N
        lblParamPolice.setText("Police :");
        panelParametre.add(lblParamPolice);
        lblParamPolice.setBounds(40, 170, 150, 40);

        btnUploadBg.setBackground(new java.awt.Color(168, 111, 0));
        btnUploadBg.setFont(new java.awt.Font("Cormorant Garamond", 0, 24)); // NOI18N
        btnUploadBg.setForeground(new java.awt.Color(255, 255, 255));
        btnUploadBg.setText("Upload BackGround");
        btnUploadBg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadBgActionPerformed(evt);
            }
        });
        panelParametre.add(btnUploadBg);
        btnUploadBg.setBounds(197, 248, 270, 39);

        lblParamUpBG.setFont(new java.awt.Font("Cormorant Garamond", 1, 23)); // NOI18N
        lblParamUpBG.setForeground(new java.awt.Color(153, 51, 0));
        lblParamUpBG.setText("Use 960 x 678 px");
        panelParametre.add(lblParamUpBG);
        lblParamUpBG.setBounds(37, 250, 160, 29);

        lblSignature.setFont(new java.awt.Font("Freestyle Script", 3, 36)); // NOI18N
        lblSignature.setForeground(new java.awt.Color(116, 77, 0));
        lblSignature.setText("By MSGB");
        panelParametre.add(lblSignature);
        lblSignature.setBounds(580, 470, 120, 40);

        btnThemePink.setBackground(new java.awt.Color(255, 51, 102));
        btnThemePink.setFont(new java.awt.Font("Cormorant Garamond", 0, 20)); // NOI18N
        btnThemePink.setForeground(new java.awt.Color(255, 255, 255));
        btnThemePink.setText("Pink");
        btnThemePink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemePinkActionPerformed(evt);
            }
        });
        panelParametre.add(btnThemePink);
        btnThemePink.setBounds(389, 107, 78, 39);

        panelGlobale.add(panelParametre);
        panelParametre.setBounds(220, 110, 730, 560);
        panelParametre.setVisible(false);

        imgBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img.jpg"))); // NOI18N
        imgBackground.setOpaque(true);
        panelGlobale.add(imgBackground);
        imgBackground.setBounds(0, 0, 960, 678);

        getContentPane().add(panelGlobale);
        panelGlobale.setBounds(0, 0, 960, 678);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public final void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo.jpg")));
    }

    public final void tableListener() {
        jTextArea1.getCaretListeners();
        jTextArea1.getDocument().addDocumentListener(new DocumentListener() {
            public String getText() {
                int caretPosition = jTextArea1.getDocument().getLength();
                Element root = jTextArea1.getDocument().getDefaultRootElement();
                String text = "1" + System.getProperty("line.separator");
                for (int i = 2; i < root.getElementIndex(caretPosition) + 2; i++) {
                    text += i + System.getProperty("line.separator");
                }
                return text;
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                jTextArea2.setText(getText());
            }

            @Override
            public void insertUpdate(DocumentEvent de) {
                jTextArea2.setText(getText());
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                jTextArea2.setText(getText());
            }

        });
    }

    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed

        System.exit(0);

    }//GEN-LAST:event_btnQuitterActionPerformed

    private void btnParametreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParametreActionPerformed

        panelAccueil.setVisible(false);
        panelParametre.setVisible(true);

    }//GEN-LAST:event_btnParametreActionPerformed

    private void btnNouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNouveauActionPerformed

        panelAccueil.setVisible(false);
        panelEditeur.setVisible(true);
        jTextArea1.requestFocus();
        openText(fileName);

    }//GEN-LAST:event_btnNouveauActionPerformed

    private void btnFichierOuvert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichierOuvert1ActionPerformed

        switch (textActif) {
            case "1" ->
                text1 = jTextArea1.getText();
            case "2" ->
                text2 = jTextArea1.getText();
            case "3" ->
                text3 = jTextArea1.getText();
        }
        textActif = "1";
        jTextArea1.setText(text1);
        btnFichierOuvert1.setBackground(new java.awt.Color(153, 102, 0));
        btnFichierOuvert2.setBackground(new java.awt.Color(79, 53, 0));
        btnFichierOuvert3.setBackground(new java.awt.Color(79, 53, 0));

    }//GEN-LAST:event_btnFichierOuvert1ActionPerformed

    private void btnColorBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorBlackActionPerformed

        jTextArea1.setForeground(Color.BLACK);
        panelColorChoose.setVisible(false);

    }//GEN-LAST:event_btnColorBlackActionPerformed

    private void btnColorWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorWhiteActionPerformed

        jTextArea1.setForeground(Color.WHITE);
        panelColorChoose.setVisible(false);

    }//GEN-LAST:event_btnColorWhiteActionPerformed

    private void btnColorRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorRedActionPerformed

        jTextArea1.setForeground(Color.RED);
        panelColorChoose.setVisible(false);

    }//GEN-LAST:event_btnColorRedActionPerformed

    private void btnColorYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorYellowActionPerformed

        jTextArea1.setForeground(Color.YELLOW);
        panelColorChoose.setVisible(false);

    }//GEN-LAST:event_btnColorYellowActionPerformed

    private void btnParamSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParamSaveActionPerformed

        try {
            int x = 0;
            String choix = cbPolice.getSelectedItem().toString();
            if ("Garamond".equals(choix)) {
                x = 2;
            }
            lblTitre.setText(txtChangeTitre.getText());
            changeTextFont(choix, x);

        } catch (Exception e) {
            System.out.println("Erreur Change Police" + e);
        }
    }//GEN-LAST:event_btnParamSaveActionPerformed

    public void changeTextFont(String choix, int x) {

        lblTitre.setFont(new java.awt.Font(choix, x, 78));

        lblParamTitre.setFont(new java.awt.Font(choix, x, 36));
        lblParamTheme.setFont(new java.awt.Font(choix, x, 36));
        lblParamPolice.setFont(new java.awt.Font(choix, x, 36));

        lblParamUpBG.setFont(new java.awt.Font(choix, x, 23));
        btnUploadBg.setFont(new java.awt.Font(choix, x, 24));
        
        txtChangeTitre.setFont(new java.awt.Font(choix, x, 24));
        cbPolice.setFont(new java.awt.Font(choix, x, 24));
        
        btnThemeClassique.setFont(new java.awt.Font(choix, x, 20));
        btnThemeBlack.setFont(new java.awt.Font(choix, x, 20));
        btnThemePink.setFont(new java.awt.Font(choix, x, 20));

        btnParamSave.setFont(new java.awt.Font(choix, x, 24));
        btnParamRetour.setFont(new java.awt.Font(choix, x, 24));
        
        btnNouveau.setFont(new java.awt.Font(choix, x, 24));
        btnParametre.setFont(new java.awt.Font(choix, x, 24));
        btnQuitter.setFont(new java.awt.Font(choix, x, 24));
        
        jTextArea1.setFont(new java.awt.Font(choix, x, 24));
        jTextArea2.setFont(new java.awt.Font(choix, x, 24));
        
        btnFichierOuvert1.setFont(new java.awt.Font(choix, x, 24));
        btnFichierOuvert2.setFont(new java.awt.Font(choix, x, 24));
        btnFichierOuvert3.setFont(new java.awt.Font(choix, x, 24));
        repaint();

    }

    private void btnParamRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParamRetourActionPerformed

        panelParametre.setVisible(false);
        panelAccueil.setVisible(true);

    }//GEN-LAST:event_btnParamRetourActionPerformed

    private void btnThemeClassiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemeClassiqueActionPerformed

        imgBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img.jpg")));

        jTextArea1.setForeground(Color.BLACK);
        lblSignature.setForeground(Color.BLACK);

        Color colorMenu = new Color(0, 0, 0);
        Color colorTitre = new Color(153, 51, 0);
        changeTitreEtMenuColor(colorTitre, colorMenu);

        Color colorBtnEditeur = new Color(153, 102, 0);
        changeBtnColor(colorBtnEditeur);
        repaint();

    }//GEN-LAST:event_btnThemeClassiqueActionPerformed

    private void btnThemeBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemeBlackActionPerformed

        imgBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg2.jpg")));

        Color colorTitre = new Color(255, 255, 255);
        Color colorMenu = new Color(255, 255, 255);
        changeTitreEtMenuColor(colorTitre, colorMenu);

        Color color = new Color(204, 204, 255);
        changeBtnColor(color);

        repaint();

    }//GEN-LAST:event_btnThemeBlackActionPerformed

    public void changeTitreEtMenuColor(Color colorTitre, Color colorMenu) {

        lblTitre.setForeground(Color.getColor("", colorTitre));

        jTextArea1.setForeground(Color.getColor("", colorMenu));
        lblParamTitre.setForeground(Color.getColor("", colorMenu));
        lblParamTheme.setForeground(Color.getColor("", colorMenu));
        lblParamPolice.setForeground(Color.getColor("", colorMenu));
        lblSignature.setForeground(Color.getColor("", colorMenu));
        lblParamUpBG.setForeground(Color.getColor("", colorMenu));

    }

    public void changeBtnColor(Color color) {

        btnAdd.setBackground(Color.getColor("", color));
        btnOpen.setBackground(Color.getColor("", color));
        btnSave.setBackground(Color.getColor("", color));
        btnSaveAs.setBackground(Color.getColor("", color));
        btnColor.setBackground(Color.getColor("", color));
        btnExit.setBackground(Color.getColor("", color));

    }

    private void btnUploadBgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadBgActionPerformed

        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            repaint();

            imgBackground.setIcon(new javax.swing.ImageIcon(filename));
        } catch (HeadlessException e) {
            System.out.println("Aucun répertoire n'a été choisi : " + e);
        }

    }//GEN-LAST:event_btnUploadBgActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        countNewFiles++;
        switch (countNewFiles) {
            case 1 -> {

                text1 = jTextArea1.getText();
                btnFichierOuvert2.setVisible(true);
                btnFichierOuvert2.setText("New-file " + countNewFiles);
                textActif = "2";
                jTextArea1.setText(text2);
                btnFichierOuvert1.setBackground(new java.awt.Color(79, 53, 0));
                btnFichierOuvert2.setBackground(new java.awt.Color(153, 102, 0));
                btnFichierOuvert3.setBackground(new java.awt.Color(79, 53, 0));

            }
            case 2 -> {
                text2 = jTextArea1.getText();
                btnFichierOuvert3.setVisible(true);
                btnFichierOuvert3.setText("New-file " + countNewFiles);
                textActif = "3";
                jTextArea1.setText(text3);
                btnFichierOuvert1.setBackground(new java.awt.Color(79, 53, 0));
                btnFichierOuvert2.setBackground(new java.awt.Color(79, 53, 0));
                btnFichierOuvert3.setBackground(new java.awt.Color(153, 102, 0));
            }
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed

        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            if (f != null) {
                fileName = f.getAbsolutePath();
                justfilename = f.getName();
            }

            openText(fileName);
            btnFichierOuvert1.setText(justfilename);

            repaint();
        } catch (HeadlessException e) {
            System.out.println("Aucun répertoire n'a été choisi : " + e);
        }

    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String text = jTextArea1.getText();
        updateText(fileName, text);

        lblSaveMessage.setVisible(true);
        lblSaveMessage.requestFocus();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed

        if (colorPaneState == true) {
            panelColorChoose.setVisible(true);
            colorPaneState = false;
        } else {
            panelColorChoose.setVisible(false);
            colorPaneState = true;
        }

    }//GEN-LAST:event_btnColorActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        panelEditeur.setVisible(false);
        panelAccueil.setVisible(true);

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnFichierOuvert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichierOuvert2ActionPerformed

        switch (textActif) {
            case "1" ->
                text1 = jTextArea1.getText();
            case "2" ->
                text2 = jTextArea1.getText();
            case "3" ->
                text3 = jTextArea1.getText();
        }

        textActif = "2";
        jTextArea1.setText(text2);
        btnFichierOuvert1.setBackground(new java.awt.Color(79, 53, 0));
        btnFichierOuvert2.setBackground(new java.awt.Color(153, 102, 0));
        btnFichierOuvert3.setBackground(new java.awt.Color(79, 53, 0));

    }//GEN-LAST:event_btnFichierOuvert2ActionPerformed

    private void btnFichierOuvert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichierOuvert3ActionPerformed

        switch (textActif) {
            case "1" ->
                text1 = jTextArea1.getText();
            case "2" ->
                text2 = jTextArea1.getText();
            case "3" ->
                text3 = jTextArea1.getText();
        }

        textActif = "3";
        jTextArea1.setText(text3);
        btnFichierOuvert1.setBackground(new java.awt.Color(79, 53, 0));
        btnFichierOuvert2.setBackground(new java.awt.Color(79, 53, 0));
        btnFichierOuvert3.setBackground(new java.awt.Color(153, 102, 0));

    }//GEN-LAST:event_btnFichierOuvert3ActionPerformed

    private void btnCloseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseFileActionPerformed

    private void btnThemePinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemePinkActionPerformed

        imgBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg4.png")));

        Color colorTitre = new Color(255, 255, 255);
        Color colorMenu = new Color(255, 255, 255);
        changeTitreEtMenuColor(colorTitre, colorMenu);

        Color color = new Color(204, 204, 255);
        changeBtnColor(color);

        repaint();

    }//GEN-LAST:event_btnThemePinkActionPerformed

    private void lblSaveMessageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblSaveMessageFocusLost
        lblSaveMessage.setVisible(false);
    }//GEN-LAST:event_lblSaveMessageFocusLost

    private void cbPoliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPoliceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPoliceActionPerformed

    public void openText(String fileName) {

        try {
            FileReader fr = new FileReader(fileName);
            try ( BufferedReader br = new BufferedReader(fr)) {
                String line;
                jTextArea1.setText("");
                text1 = "";
                while ((line = br.readLine()) != null) {
                    text1 = text1 + line + "\n";
                    repaint();
                }

                jTextArea1.setText(text1);
            }
        } catch (IOException e) {
            System.out.println("Error" + e);
        }
    }

    public void updateText(String fileName, String text) {
        try {
            if ("temp".equals(fileName)) {
                String init = fileName;
                switch (textActif) {
                    case "2" ->
                        fileName = init + "1";
                    case "3" ->
                        fileName = init + "2";
                }
            }
            FileWriter fw = new FileWriter(fileName);
            fw.write(text);
            fw.close();

        } catch (IOException e) {
            System.out.println("Error" + e);
        }
    }

    public void actionListener(ActionListener ae) {

        jTextArea1.getCaretPosition();
        System.out.println("hello");
        System.out.println(jTextArea1.getCaretPosition());

    }

    public static void main(String args[]) {
        //Look and Feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tawfekh_editor().setVisible(true);
        });
    }

    int countNewFiles = 0;
    boolean colorPaneState = true;
    String fileName = "temp", justfilename = "temp";
    String text1, text2, text3;
    String textActif = "1";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCloseFile;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnColorBlack;
    private javax.swing.JButton btnColorRed;
    private javax.swing.JButton btnColorWhite;
    private javax.swing.JButton btnColorYellow;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFichierOuvert1;
    private javax.swing.JButton btnFichierOuvert2;
    private javax.swing.JButton btnFichierOuvert3;
    private javax.swing.JButton btnNouveau;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnParamRetour;
    private javax.swing.JButton btnParamSave;
    private javax.swing.JButton btnParametre;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveAs;
    private javax.swing.JButton btnThemeBlack;
    private javax.swing.JButton btnThemeClassique;
    private javax.swing.JButton btnThemePink;
    private javax.swing.JButton btnUploadBg;
    private javax.swing.JComboBox<String> cbPolice;
    private javax.swing.JLabel imgBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblParamPolice;
    private javax.swing.JLabel lblParamTheme;
    private javax.swing.JLabel lblParamTitre;
    private javax.swing.JLabel lblParamUpBG;
    private javax.swing.JLabel lblSaveMessage;
    private javax.swing.JLabel lblSignature;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JPanel panelAccueil;
    private javax.swing.JPanel panelColorChoose;
    private javax.swing.JPanel panelEditeur;
    private javax.swing.JPanel panelFichiers;
    private javax.swing.JPanel panelGlobale;
    private javax.swing.JPanel panelParametre;
    private javax.swing.JTextField txtChangeTitre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {

        throw new UnsupportedOperationException("Not supported yet.");
    }
}
