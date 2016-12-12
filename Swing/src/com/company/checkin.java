package com.company;

import sun.plugin2.message.ShowStatusMessage;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by arteman on 07.12.16.
 */
public class checkin extends JFrame {
    private JPanel buttonPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label;
    private JTextField textField1;
    private JTextArea textArea1;
    private JCheckBox bold;
    private JCheckBox italic;
    private JPanel checkPanel;
    private JPanel textPanel;
    private JComboBox<String> faceCombo;
    private JMenuBar menuBar;

    public checkin() throws HeadlessException {
        setTitle("My Frame");
        setSize(500,200);

        buttonPanel = new JPanel();
        //buttonPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        checkPanel = new JPanel();
        //checkPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        textPanel = new JPanel();
        textPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        add(buttonPanel, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(checkPanel, BorderLayout.SOUTH);
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu openMenu = new JMenu("New");
        menuBar.add(openMenu);
        JMenuItem open = openMenu.add("Open Document");
        openMenu.addSeparator();
        JMenuItem create = openMenu.add("Create Document");
        create.setEnabled(false);
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);
        JMenu pasteItem = new JMenu("Paste");
        menuBar.add(pasteItem);
        JMenu exitItem = new JMenu("Exit");
        menuBar.add(exitItem);
        JMenuItem exit = exitItem.add("Exit");
        exit.setToolTipText("Exit immediately");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exitItem.add(new AbstractAction("My Exit") {
            @Override
            public void actionPerformed(ActionEvent e) {
              System.exit(0);
            }
        });
        JPopupMenu popup = new JPopupMenu();
        JMenuItem item = new JMenuItem("Cut");
        popup.add(item);
        //textPanel.add(popup);


        buttonPanel.setLayout(new GridLayout(1,3));
        buttonPanel.setBackground(Color.yellow);
        buttonPanel.add(new JLabel("Buttons: ",SwingConstants.RIGHT));
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);


        textPanel.setLayout(new GridLayout(3,1));
        label = new JLabel("My lable");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        textArea1 = new JTextArea();
        //JScrollPane scrollPane = new JScrollPane(textArea1);
        //textPanel.add(scrollPane, BorderLayout.CENTER);
        textPanel.add(textArea1);
        textPanel.add(label);
        faceCombo = new JComboBox<>();
        faceCombo.addItem("jCatering");
        faceCombo.addItem("jHealth");
        faceCombo.addItem("jStock");
        faceCombo.addItem("jVned");
        faceCombo.addItem("jUnion");
        textPanel.add(faceCombo);
        faceCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //if (faceCombo.getSelectedItem() == "jCatering") {
                    label.setText((String)faceCombo.getSelectedItem());
                //}
            }
        });


        bold = new JCheckBox("Bold");
        italic = new JCheckBox("Italic");
        checkPanel.add(bold);
        checkPanel.add(italic);
       // bold.setSelected(true);
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mode = 0;
                if (bold.isSelected()) {
                    mode += Font.BOLD;
                }
                if (italic.isSelected()) {
                    mode += Font.ITALIC;
                }
                label.setFont(new Font("Serif", mode, 24));
            }
        };
        bold.addActionListener(listener);
        italic.addActionListener(listener);

        //pack();

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3.doClick();
                textField1.setText("yo yo yo ");
            }
        });
    }
}
