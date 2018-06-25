
/**
 * This project generates a character to be used for writers.
 *
 * @author Spirit Palmer
 */
public class Main extends javax.swing.JFrame {

	boolean gender, sex, orientation, religion, person, spec, age, day, eth, hair, eye;

	/**
	 * Creates new form Frame
	 */
	public Main() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		aboutDialog = new javax.swing.JDialog();
		okayButton = new javax.swing.JButton();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		image = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		name = new javax.swing.JLabel();
		gendertext = new javax.swing.JLabel();
		genderbox = new javax.swing.JTextField();
		sextext = new javax.swing.JLabel();
		sexbox = new javax.swing.JTextField();
		orientationtext = new javax.swing.JLabel();
		orientationbox = new javax.swing.JTextField();
		religiontext = new javax.swing.JLabel();
		religionbox = new javax.swing.JTextField();
		namebox = new javax.swing.JTextField();
		sexlock = new javax.swing.JToggleButton();
		speciestext = new javax.swing.JLabel();
		speciesbox = new javax.swing.JTextField();
		agetext = new javax.swing.JLabel();
		agebox = new javax.swing.JTextField();
		birthdaytext = new javax.swing.JLabel();
		daybox = new javax.swing.JTextField();
		ethnicitytext = new javax.swing.JLabel();
		ethbox = new javax.swing.JTextField();
		specieslock = new javax.swing.JToggleButton();
		agelock = new javax.swing.JToggleButton();
		daylock = new javax.swing.JToggleButton();
		ethlock = new javax.swing.JToggleButton();
		typetext = new javax.swing.JLabel();
		personalitybox = new javax.swing.JTextField();
		hairtext = new javax.swing.JLabel();
		hairbox = new javax.swing.JTextField();
		hairlock = new javax.swing.JToggleButton();
		eyetext = new javax.swing.JLabel();
		eyebox = new javax.swing.JTextField();
		eyelock = new javax.swing.JToggleButton();
		randomize = new javax.swing.JButton();
		orientationlock = new javax.swing.JToggleButton();
		genderlock = new javax.swing.JToggleButton();
		religionlock = new javax.swing.JToggleButton();
		personalitylock = new javax.swing.JToggleButton();
		jMenuBar1 = new javax.swing.JMenuBar();
		File = new javax.swing.JMenu();
		New = new javax.swing.JMenuItem();
		autoRandomize = new javax.swing.JMenuItem();
		Help = new javax.swing.JMenu();
		Reference = new javax.swing.JMenuItem();
		About = new javax.swing.JMenuItem();

		aboutDialog.setTitle("About Character Generator");
		aboutDialog.setAlwaysOnTop(true);
		aboutDialog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		aboutDialog.setMinimumSize(new java.awt.Dimension(325, 350));
		aboutDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
		aboutDialog.setResizable(false);

		okayButton.setText("OK");
		okayButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				okayButtonActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Aharoni", 3, 24)); // NOI18N
		jLabel1.setText("Character Generator");

		jLabel2.setText(" Version 1.01");

		image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageedit_6_6608544629.png"))); // NOI18N

		jLabel3.setText(" Character Generator is meant to be a freeware and is");

		jLabel4.setText(" not to be used for commercial purposes.");

		jLabel5.setText(" For any suggestions on how to improve the program");

		jLabel6.setText("© 2015 Tamara Wertheim. All rights reserved.");

		jLabel7.setText(" please send a message to");

		jLabel8.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(0, 102, 255));
		jLabel8.setText("[Placeholder]");

		javax.swing.GroupLayout aboutDialogLayout = new javax.swing.GroupLayout(aboutDialog.getContentPane());
		aboutDialog.getContentPane().setLayout(aboutDialogLayout);
		aboutDialogLayout
				.setHorizontalGroup(
						aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(aboutDialogLayout
										.createSequentialGroup().addContainerGap().addGroup(aboutDialogLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														aboutDialogLayout.createSequentialGroup().addComponent(jLabel2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(okayButton,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 75,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(aboutDialogLayout.createSequentialGroup()
														.addGroup(aboutDialogLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(aboutDialogLayout.createSequentialGroup()
																		.addComponent(image)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				246,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addComponent(jLabel3).addComponent(jLabel4)
																.addComponent(jLabel5).addComponent(jLabel7)
																.addGroup(aboutDialogLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addComponent(jLabel8,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(jLabel6,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)))
														.addGap(0, 0, Short.MAX_VALUE)))
										.addContainerGap()));
		aboutDialogLayout.setVerticalGroup(aboutDialogLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutDialogLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(aboutDialogLayout.createSequentialGroup().addComponent(image)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										aboutDialogLayout.createSequentialGroup().addComponent(jLabel1).addGap(26, 26,
												26)))
						.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel4)
						.addGap(18, 18, 18).addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel7)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel8)
						.addGap(18, 18, 18).addComponent(jLabel6)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
						.addGroup(aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(okayButton).addComponent(jLabel2))
						.addContainerGap()));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Character Generator");
		setResizable(false);

		name.setText("Name:");

		gendertext.setText("Gender:");

		genderbox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				genderboxActionPerformed(evt);
			}
		});

		sextext.setText("Sex:");

		sexbox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sexboxActionPerformed(evt);
			}
		});

		orientationtext.setText("Sexual Orientation:");

		religiontext.setText("Religion:");

		namebox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nameboxActionPerformed(evt);
			}
		});

		sexlock.setText("Lock");
		sexlock.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sexlockActionPerformed(evt);
			}
		});

		speciestext.setText("Species:");

		speciesbox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				speciesboxActionPerformed(evt);
			}
		});

		agetext.setText("Age:");

		agebox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ageboxActionPerformed(evt);
			}
		});

		birthdaytext.setText("Birthday:");

		ethnicitytext.setText("Ethnicity:");

		specieslock.setText("Lock");
		specieslock.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				specieslockActionPerformed(evt);
			}
		});

		agelock.setText("Lock");
		agelock.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				agelockActionPerformed(evt);
			}
		});

		daylock.setText("Lock");
		daylock.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				daylockActionPerformed(evt);
			}
		});

		ethlock.setText("Lock");
		ethlock.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ethlockActionPerformed(evt);
			}
		});

		typetext.setText("Personality Type:");

		hairtext.setText("Hair Color:");

		hairbox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				hairboxActionPerformed(evt);
			}
		});

		hairlock.setText("Lock");
		hairlock.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				hairlockActionPerformed(evt);
			}
		});

		eyetext.setText("Eye Color:");

		eyelock.setText("Lock");
		eyelock.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				eyelockActionPerformed(evt);
			}
		});

		randomize.setText("Randomize!");
		randomize.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				randomizeActionPerformed(evt);
			}
		});

		orientationlock.setText("Lock");
		orientationlock.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				orientationlockActionPerformed(evt);
			}
		});

		genderlock.setText("Lock");
		genderlock.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				genderlockActionPerformed(evt);
			}
		});

		religionlock.setText("Lock");
		religionlock.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				religionlockActionPerformed(evt);
			}
		});

		personalitylock.setText("Lock");
		personalitylock.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				personalitylockActionPerformed(evt);
			}
		});

		File.setText("File");
		File.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				FileActionPerformed(evt);
			}
		});

		New.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
		New.setText("New");
		New.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				NewActionPerformed(evt);
			}
		});
		File.add(New);

		autoRandomize.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
		autoRandomize.setText("Randomize");
		autoRandomize.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				autoRandomizeActionPerformed(evt);
			}
		});
		File.add(autoRandomize);

		jMenuBar1.add(File);

		Help.setText("Help");

		Reference.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
		Reference.setText("Reference");
		Reference.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ReferenceActionPerformed(evt);
			}
		});
		Help.add(Reference);

		About.setText("About");
		About.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AboutActionPerformed(evt);
			}
		});
		Help.add(About);

		jMenuBar1.add(Help);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addGap(60, 60, 60).addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(gendertext)
						.addComponent(sextext).addComponent(orientationtext).addComponent(religiontext)
						.addComponent(typetext)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(personalitybox, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
										.addComponent(religionbox, javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(orientationbox, javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(sexbox, javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(genderbox, javax.swing.GroupLayout.Alignment.LEADING))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(sexlock, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(orientationlock, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(religionlock, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(personalitylock, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(genderlock, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addComponent(randomize, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup()
										.addComponent(eyebox, javax.swing.GroupLayout.PREFERRED_SIZE, 134,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(eyelock, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup()
												.addComponent(hairbox, javax.swing.GroupLayout.PREFERRED_SIZE, 134,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(hairlock, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(eyetext)
										.addGroup(layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(ethnicitytext, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(birthdaytext, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(agetext, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(speciestext, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(speciesbox, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(agebox, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(daybox, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(ethbox, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.PREFERRED_SIZE, 134,
														javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(agelock,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(specieslock,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(daylock,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(ethlock,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
										.addComponent(hairtext)))
						.addContainerGap(60, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup().addGap(19, 19, 19).addComponent(name)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, 134,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(40, 40, 40)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(name).addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(gendertext).addComponent(speciestext))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(genderbox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(speciesbox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(specieslock).addComponent(genderlock))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(sextext).addComponent(agetext))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(sexbox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(agebox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(agelock).addComponent(sexlock))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(orientationtext).addComponent(birthdaytext))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(orientationbox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(daybox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(daylock).addComponent(orientationlock))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(religiontext).addComponent(ethnicitytext))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(religionbox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(ethbox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(ethlock).addComponent(religionlock))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(typetext).addComponent(hairtext))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(personalitybox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(hairbox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(hairlock).addComponent(personalitylock))
						.addGap(18, 18, 18).addComponent(eyetext)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(eyebox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(eyelock).addComponent(randomize))
						.addContainerGap(60, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void genderboxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_genderboxActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_genderboxActionPerformed

	private void sexboxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sexboxActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_sexboxActionPerformed

	private void randomizeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_randomizeActionPerformed
		if (!genderlock.isSelected()) {
			Gender genderObj = new Gender();
			genderbox.setText(genderObj.getGender());
		}
		if (!sexlock.isSelected()) {
			Sex sexObj = new Sex();
			sexbox.setText(sexObj.getSex());
		}
		if (!orientationlock.isSelected()) {
			Sexual_Orientation orienObj = new Sexual_Orientation();
			orientationbox.setText(orienObj.getOrientation());
		}
		if (!religionlock.isSelected()) {
			Religion relObj = new Religion();
			religionbox.setText(relObj.getReligion());
		}
		if (!personalitylock.isSelected()) {
			Personality perObj = new Personality();
			personalitybox.setText(perObj.getPersonality() + " - " + perObj.getStat());
		}
		if (!specieslock.isSelected()) {
			Species specObj = new Species();
			speciesbox.setText(specObj.getSpecies());
		}
		if (!agelock.isSelected()) {
			Age relAge = new Age();
			agebox.setText(relAge.getAge());
		}
		if (!daylock.isSelected()) {
			Age relAge = new Age();
			daybox.setText(relAge.getBirthday());
		}
		if (!ethlock.isSelected()) {
			Ethnicity ethObj = new Ethnicity();
			ethbox.setText(ethObj.getEthnicity());
		}
		if (!hairlock.isSelected()) {
			Hair hairObj = new Hair();
			String ha = hairObj.getHair();
			String ir = hairObj.getStat();
			hairbox.setText(ir + " " + ha);
		}
		if (!eyelock.isSelected()) {
			Eyes eyeObj = new Eyes();
			String ey = eyeObj.getEyes();
			String ye = eyeObj.getStat();
			eyebox.setText(ye + " " + ey);
		}
	}// GEN-LAST:event_randomizeActionPerformed

	private void ethlockActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ethlockActionPerformed
		if (ethlock.isSelected()) {
			ethbox.setEnabled(false);

		} else {
			ethbox.setEnabled(true);
		}
	}// GEN-LAST:event_ethlockActionPerformed

	private void daylockActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_daylockActionPerformed
		if (daylock.isSelected()) {
			daybox.setEnabled(false);

		} else {
			daybox.setEnabled(true);
		}
	}// GEN-LAST:event_daylockActionPerformed

	private void eyelockActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_eyelockActionPerformed
		if (eyelock.isSelected()) {
			eyebox.setEnabled(false);

		} else {
			eyebox.setEnabled(true);
		}
	}// GEN-LAST:event_eyelockActionPerformed

	private void nameboxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nameboxActionPerformed
	}// GEN-LAST:event_nameboxActionPerformed

	private void hairboxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_hairboxActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_hairboxActionPerformed

	private void ageboxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ageboxActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_ageboxActionPerformed

	private void hairlockActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_hairlockActionPerformed
		if (hairlock.isSelected()) {
			hairbox.setEnabled(false);

		} else {
			hairbox.setEnabled(true);
		}
	}// GEN-LAST:event_hairlockActionPerformed

	private void specieslockActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_specieslockActionPerformed
		if (specieslock.isSelected()) {
			speciesbox.setEnabled(false);

		} else {
			speciesbox.setEnabled(true);
		}
	}// GEN-LAST:event_specieslockActionPerformed

	private void personalitylockActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_personalitylockActionPerformed
		if (personalitylock.isSelected()) {
			personalitybox.setEnabled(false);

		} else {
			personalitybox.setEnabled(true);
		}
	}// GEN-LAST:event_personalitylockActionPerformed

	private void religionlockActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_religionlockActionPerformed
		if (religionlock.isSelected()) {
			religionbox.setEnabled(false);

		} else {
			religionbox.setEnabled(true);
		}
	}// GEN-LAST:event_religionlockActionPerformed

	private void orientationlockActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_orientationlockActionPerformed
		if (orientationlock.isSelected()) {
			orientationbox.setEnabled(false);

		} else {
			orientationbox.setEnabled(true);
		}
	}// GEN-LAST:event_orientationlockActionPerformed

	private void sexlockActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sexlockActionPerformed
		if (sexlock.isSelected()) {
			sexbox.setEnabled(false);

		} else {
			sexbox.setEnabled(true);
		}
	}// GEN-LAST:event_sexlockActionPerformed

	private void genderlockActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_genderlockActionPerformed
		if (genderlock.isSelected()) {
			genderbox.setEnabled(false);

		} else {
			genderbox.setEnabled(true);
		}
	}// GEN-LAST:event_genderlockActionPerformed

	private void speciesboxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_speciesboxActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_speciesboxActionPerformed

	private void agelockActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_agelockActionPerformed
		if (agelock.isSelected()) {
			agebox.setEnabled(false);

		} else {
			agebox.setEnabled(true);
		}
	}// GEN-LAST:event_agelockActionPerformed

	private void AboutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_AboutActionPerformed
		aboutDialog.setVisible(true);
	}// GEN-LAST:event_AboutActionPerformed

	private void ReferenceActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ReferenceActionPerformed
		Dictionary diction = new Dictionary();
		diction.setVisible(true);
	}// GEN-LAST:event_ReferenceActionPerformed

	private void FileActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FileActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_FileActionPerformed

	private void NewActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_NewActionPerformed
		namebox.setText("");
		genderbox.setText("");
		genderbox.setEnabled(true);
		genderlock.setSelected(false);
		sexbox.setText("");
		sexbox.setEnabled(true);
		sexlock.setSelected(false);
		orientationbox.setText("");
		orientationbox.setEnabled(true);
		orientationlock.setSelected(false);
		religionbox.setText("");
		religionbox.setEnabled(true);
		religionlock.setSelected(false);
		personalitybox.setText("");
		personalitybox.setEnabled(true);
		personalitylock.setSelected(false);
		speciesbox.setText("");
		speciesbox.setEnabled(true);
		specieslock.setSelected(false);
		agebox.setText("");
		agebox.setEnabled(true);
		agelock.setSelected(false);
		daybox.setText("");
		daybox.setEnabled(true);
		daylock.setSelected(false);
		ethbox.setText("");
		ethbox.setEnabled(true);
		ethlock.setSelected(false);
		hairbox.setText("");
		hairbox.setEnabled(true);
		hairlock.setSelected(false);
		eyebox.setText("");
		eyebox.setEnabled(true);
		eyelock.setSelected(false);
	}// GEN-LAST:event_NewActionPerformed

	private void okayButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_okayButtonActionPerformed
		aboutDialog.dispose();
	}// GEN-LAST:event_okayButtonActionPerformed

	private void autoRandomizeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_autoRandomizeActionPerformed
		if (!genderlock.isSelected()) {
			Gender genderObj = new Gender();
			genderbox.setText(genderObj.getGender());
		}
		if (!sexlock.isSelected()) {
			Sex sexObj = new Sex();
			sexbox.setText(sexObj.getSex());
		}
		if (!orientationlock.isSelected()) {
			Sexual_Orientation orienObj = new Sexual_Orientation();
			orientationbox.setText(orienObj.getOrientation());
		}
		if (!religionlock.isSelected()) {
			Religion relObj = new Religion();
			religionbox.setText(relObj.getReligion());
		}
		if (!personalitylock.isSelected()) {
			Personality perObj = new Personality();
			personalitybox.setText(perObj.getPersonality() + " - " + perObj.getStat());
		}
		if (!specieslock.isSelected()) {
			Species specObj = new Species();
			speciesbox.setText(specObj.getSpecies());
		}
		if (!agelock.isSelected()) {
			Age relAge = new Age();
			agebox.setText(relAge.getAge());
		}
		if (!daylock.isSelected()) {
			Age relAge = new Age();
			daybox.setText(relAge.getBirthday());
		}
		if (!ethlock.isSelected()) {
			Ethnicity ethObj = new Ethnicity();
			ethbox.setText(ethObj.getEthnicity());
		}
		if (!hairlock.isSelected()) {
			Hair hairObj = new Hair();
			String ha = hairObj.getHair();
			String ir = hairObj.getStat();
			hairbox.setText(ir + " " + ha);
		}
		if (!eyelock.isSelected()) {
			Eyes eyeObj = new Eyes();
			String ey = eyeObj.getEyes();
			String ye = eyeObj.getStat();
			eyebox.setText(ye + " " + ey);
		}
	}// GEN-LAST:event_autoRandomizeActionPerformed

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JMenuItem About;
	private javax.swing.JMenu File;
	private javax.swing.JMenu Help;
	private javax.swing.JMenuItem New;
	private javax.swing.JMenuItem Reference;
	private javax.swing.JDialog aboutDialog;
	private javax.swing.JTextField agebox;
	private javax.swing.JToggleButton agelock;
	private javax.swing.JLabel agetext;
	private javax.swing.JMenuItem autoRandomize;
	private javax.swing.JLabel birthdaytext;
	private javax.swing.JTextField daybox;
	private javax.swing.JToggleButton daylock;
	private javax.swing.JTextField ethbox;
	private javax.swing.JToggleButton ethlock;
	private javax.swing.JLabel ethnicitytext;
	private javax.swing.JTextField eyebox;
	private javax.swing.JToggleButton eyelock;
	private javax.swing.JLabel eyetext;
	private javax.swing.JTextField genderbox;
	private javax.swing.JToggleButton genderlock;
	private javax.swing.JLabel gendertext;
	private javax.swing.JTextField hairbox;
	private javax.swing.JToggleButton hairlock;
	private javax.swing.JLabel hairtext;
	private javax.swing.JLabel image;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JLabel name;
	private javax.swing.JTextField namebox;
	private javax.swing.JButton okayButton;
	private javax.swing.JTextField orientationbox;
	private javax.swing.JToggleButton orientationlock;
	private javax.swing.JLabel orientationtext;
	private javax.swing.JTextField personalitybox;
	private javax.swing.JToggleButton personalitylock;
	private javax.swing.JButton randomize;
	private javax.swing.JTextField religionbox;
	private javax.swing.JToggleButton religionlock;
	private javax.swing.JLabel religiontext;
	private javax.swing.JTextField sexbox;
	private javax.swing.JToggleButton sexlock;
	private javax.swing.JLabel sextext;
	private javax.swing.JTextField speciesbox;
	private javax.swing.JToggleButton specieslock;
	private javax.swing.JLabel speciestext;
	private javax.swing.JLabel typetext;
	// End of variables declaration//GEN-END:variables
}
