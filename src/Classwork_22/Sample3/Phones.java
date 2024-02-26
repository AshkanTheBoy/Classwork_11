package Classwork_22.Sample3;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Phones extends JFrame {
    public  DefaultTableModel model;
    private JScrollBar scrollBar1;
    private JPanel panel;
    private JTable table1;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;


    public static List<Phone> phones = new ArrayList<>();
    static {
        phones.add(new Phone("surname","name","adress","phone"));
        phones.add(new Phone("surname","name","adress","phone"));
    }

    public Phones(){
        setTitle("Sample1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setContentPane(panel);
        String[] columnNames = {"Surname", "Name", "Address","Number"};
        model = new DefaultTableModel(null, columnNames);
        table1.setModel(model);
        for (Phone phone: phones)
        model.addRow(new String[]{phone.getSurname(), phone.getName(), phone.getAddress(), phone.getNumber()});
        table1.setModel(model);

        setContentPane(panel);
        setLocationRelativeTo(null);
        addMenu();
        setVisible(true);

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PhoneDelete dialog = new PhoneDelete();
                dialog.setSize(300, 250);
                dialog.setLocationRelativeTo(null);

                //dialog.pack();
                dialog.setTitle("Вы уверены?");
                dialog.setVisible(true);
                int row = table1.getSelectedRow();
                model.removeRow(row);
                phones.remove(row);
                //System.out.println(Arrays.toString(phones.toArray()));
            }
        });
    }

    public static void main(String[] args) {
        new Phones();
    }

    private void addMenu() {
        // create a menubar
        JMenuBar menuBar = new JMenuBar();

        // create a menu
        JMenu menu1 = new JMenu("Phone");

        // create menuitems
        JMenuItem mAdd = new JMenuItem("Add");
        JMenuItem mEdit = new JMenuItem("Edit");
        JMenuItem mDelete = new JMenuItem("Detele");
        JMenuItem mExit = new JMenuItem("Exit");

        // add menu items to menu
        menu1.add(mAdd);
        menu1.add(mEdit);
        menu1.add(mDelete);
        menu1.add(mExit);

        // add menu to menu bar
        menuBar.add(menu1);

        // add menubar to frame
        setJMenuBar(menuBar);

        mExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}
