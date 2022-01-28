/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author DESKTOP
 */
public class selectseat extends javax.swing.JFrame {

    /**
     * Creates new form selectseat
     */
    public selectseat() {
        initComponents();
    }

    public selectseat(String CustId, Long ShowId) {
        initComponents();
        jLabel2.setText("" + CustId);
        jLabel3.setText("" + ShowId);
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kleon", "root", "");
            String sql = "select * from tickets where ShowId='" + ShowId + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int seat = rs.getInt("SeatNo");
                if (seat == 1) {
                    c1.setEnabled(false);
                }
                if (seat == 2) {
                    c2.setEnabled(false);
                }
                if (seat == 3) {
                    c3.setEnabled(false);
                }
                if (seat == 4) {
                    c4.setEnabled(false);
                }
                if (seat == 5) {
                    c5.setEnabled(false);
                }
                if (seat == 6) {
                    c6.setEnabled(false);
                }
                if (seat == 7) {
                    c7.setEnabled(false);
                }
                if (seat == 8) {
                    c8.setEnabled(false);
                }
                if (seat == 9) {
                    c9.setEnabled(false);
                }
                if (seat == 10) {
                    c10.setEnabled(false);
                }
                if (seat == 11) {
                    c11.setEnabled(false);
                }
                if (seat == 12) {
                    c12.setEnabled(false);
                }
                if (seat == 13) {
                    c13.setEnabled(false);
                }
                if (seat == 14) {
                    c14.setEnabled(false);
                }
                if (seat == 15) {
                    c15.setEnabled(false);
                }
                if (seat == 16) {
                    c16.setEnabled(false);
                }
                if (seat == 17) {
                    c17.setEnabled(false);
                }
                if (seat == 18) {
                    c18.setEnabled(false);
                }
                if (seat == 19) {
                    c19.setEnabled(false);
                }
                if (seat == 20) {
                    c20.setEnabled(false);
                }
                if (seat == 21) {
                    c21.setEnabled(false);
                }
                if (seat == 22) {
                    c22.setEnabled(false);
                }
                if (seat == 23) {
                    c23.setEnabled(false);
                }
                if (seat == 24) {
                    c24.setEnabled(false);
                }
                if (seat == 25) {
                    c25.setEnabled(false);
                }
                if (seat == 26) {
                    c26.setEnabled(false);
                }
                if (seat == 27) {
                    c27.setEnabled(false);
                }
                if (seat == 28) {
                    c28.setEnabled(false);
                }
                if (seat == 29) {
                    c29.setEnabled(false);
                }
                if (seat == 30) {
                    c30.setEnabled(false);
                }
                if (seat == 31) {
                    c31.setEnabled(false);
                }
                if (seat == 32) {
                    c32.setEnabled(false);
                }
                if (seat == 33) {
                    c33.setEnabled(false);
                }
                if (seat == 34) {
                    c34.setEnabled(false);
                }
                if (seat == 35) {
                    c35.setEnabled(false);
                }
                if (seat == 36) {
                    c36.setEnabled(false);
                }
                if (seat == 37) {
                    c37.setEnabled(false);
                }
                if (seat == 38) {
                    c38.setEnabled(false);
                }
                if (seat == 39) {
                    c39.setEnabled(false);
                }
                if (seat == 40) {
                    c40.setEnabled(false);
                }
                if (seat == 41) {
                    c41.setEnabled(false);
                }
                if (seat == 42) {
                    c42.setEnabled(false);
                }
                if (seat == 43) {
                    c43.setEnabled(false);
                }
                if (seat == 44) {
                    c44.setEnabled(false);
                }
                if (seat == 45) {
                    c45.setEnabled(false);
                }
                if (seat == 46) {
                    c46.setEnabled(false);
                }
                if (seat == 47) {
                    c47.setEnabled(false);
                }
                if (seat == 48) {
                    c48.setEnabled(false);
                }
                if (seat == 49) {
                    c49.setEnabled(false);
                }
                if (seat == 50) {
                    c50.setEnabled(false);
                }
                if (seat == 51) {
                    c51.setEnabled(false);
                }
                if (seat == 52) {
                    c52.setEnabled(false);
                }
                if (seat == 53) {
                    c53.setEnabled(false);
                }
                if (seat == 54) {
                    c54.setEnabled(false);
                }
                if (seat == 55) {
                    c55.setEnabled(false);
                }
                if (seat == 56) {
                    c56.setEnabled(false);
                }
                if (seat == 57) {
                    c57.setEnabled(false);
                }
                if (seat == 58) {
                    c58.setEnabled(false);
                }
                if (seat == 59) {
                    c59.setEnabled(false);
                }
                if (seat == 60) {
                    c60.setEnabled(false);
                }
                if (seat == 61) {
                    c61.setEnabled(false);
                }
                if (seat == 62) {
                    c62.setEnabled(false);
                }
                if (seat == 63) {
                    c63.setEnabled(false);
                }
                if (seat == 64) {
                    c64.setEnabled(false);
                }
                if (seat == 65) {
                    c65.setEnabled(false);
                }
                if (seat == 66) {
                    c66.setEnabled(false);
                }
                if (seat == 67) {
                    c67.setEnabled(false);
                }
                if (seat == 68) {
                    c68.setEnabled(false);
                }
                if (seat == 69) {
                    c69.setEnabled(false);
                }
                if (seat == 70) {
                    c70.setEnabled(false);
                }
                if (seat == 71) {
                    c71.setEnabled(false);
                }
                if (seat == 72) {
                    c72.setEnabled(false);
                }
                if (seat == 73) {
                    c73.setEnabled(false);
                }
                if (seat == 74) {
                    c74.setEnabled(false);
                }
                if (seat == 75) {
                    c75.setEnabled(false);
                }
                if (seat == 76) {
                    c76.setEnabled(false);
                }
                if (seat == 77) {
                    c77.setEnabled(false);
                }
                if (seat == 78) {
                    c78.setEnabled(false);
                }
                if (seat == 79) {
                    c79.setEnabled(false);
                }
                if (seat == 80) {
                    c80.setEnabled(false);
                }
                if (seat == 81) {
                    c81.setEnabled(false);
                }
                if (seat == 82) {
                    c82.setEnabled(false);
                }
                if (seat == 83) {
                    c83.setEnabled(false);
                }
                if (seat == 84) {
                    c84.setEnabled(false);
                }
                if (seat == 85) {
                    c85.setEnabled(false);
                }
                if (seat == 86) {
                    c86.setEnabled(false);
                }
                if (seat == 87) {
                    c87.setEnabled(false);
                }
                if (seat == 88) {
                    c88.setEnabled(false);
                }
                if (seat == 89) {
                    c89.setEnabled(false);
                }
                if (seat == 90) {
                    c90.setEnabled(false);
                }
                if (seat == 91) {
                    c91.setEnabled(false);
                }
                if (seat == 92) {
                    c92.setEnabled(false);
                }
                if (seat == 93) {
                    c93.setEnabled(false);
                }
                if (seat == 94) {
                    c94.setEnabled(false);
                }
                if (seat == 95) {
                    c95.setEnabled(false);
                }
                if (seat == 96) {
                    c96.setEnabled(false);
                }
                if (seat == 97) {
                    c97.setEnabled(false);
                }
                if (seat == 98) {
                    c98.setEnabled(false);
                }
                if (seat == 99) {
                    c99.setEnabled(false);
                }
                if (seat == 101) {
                    c101.setEnabled(false);
                }
                if (seat == 102) {
                    c102.setEnabled(false);
                }
                if (seat == 103) {
                    c103.setEnabled(false);
                }
                if (seat == 104) {
                    c104.setEnabled(false);
                }
                if (seat == 105) {
                    c105.setEnabled(false);
                }
                if (seat == 106) {
                    c106.setEnabled(false);
                }
                if (seat == 107) {
                    c107.setEnabled(false);
                }
                if (seat == 108) {
                    c108.setEnabled(false);
                }
                if (seat == 109) {
                    c109.setEnabled(false);
                }
                if (seat == 110) {
                    c110.setEnabled(false);
                }
                if (seat == 111) {
                    c111.setEnabled(false);
                }
                if (seat == 112) {
                    c112.setEnabled(false);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    public void book(String CustId, Long ShowId, int SeatNo) {
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kleon", "root", "");
            String sql;
            sql = "insert into tickets(CustUsername,ShowId,SeatNo) values('" + CustId + "','" + ShowId + "','" + SeatNo + "')";
            Statement st1 = con.createStatement();
            int row = st1.executeUpdate(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        c89 = new javax.swing.JCheckBox();
        c88 = new javax.swing.JCheckBox();
        c87 = new javax.swing.JCheckBox();
        c86 = new javax.swing.JCheckBox();
        c85 = new javax.swing.JCheckBox();
        c84 = new javax.swing.JCheckBox();
        c82 = new javax.swing.JCheckBox();
        c83 = new javax.swing.JCheckBox();
        c80 = new javax.swing.JCheckBox();
        c81 = new javax.swing.JCheckBox();
        c99 = new javax.swing.JCheckBox();
        c96 = new javax.swing.JCheckBox();
        c95 = new javax.swing.JCheckBox();
        c98 = new javax.swing.JCheckBox();
        c97 = new javax.swing.JCheckBox();
        c91 = new javax.swing.JCheckBox();
        c92 = new javax.swing.JCheckBox();
        c93 = new javax.swing.JCheckBox();
        c94 = new javax.swing.JCheckBox();
        c90 = new javax.swing.JCheckBox();
        c109 = new javax.swing.JCheckBox();
        c108 = new javax.swing.JCheckBox();
        c107 = new javax.swing.JCheckBox();
        c106 = new javax.swing.JCheckBox();
        c100 = new javax.swing.JCheckBox();
        c101 = new javax.swing.JCheckBox();
        c104 = new javax.swing.JCheckBox();
        c105 = new javax.swing.JCheckBox();
        c39 = new javax.swing.JCheckBox();
        c102 = new javax.swing.JCheckBox();
        c38 = new javax.swing.JCheckBox();
        c103 = new javax.swing.JCheckBox();
        c37 = new javax.swing.JCheckBox();
        c36 = new javax.swing.JCheckBox();
        c35 = new javax.swing.JCheckBox();
        c34 = new javax.swing.JCheckBox();
        c33 = new javax.swing.JCheckBox();
        c32 = new javax.swing.JCheckBox();
        c29 = new javax.swing.JCheckBox();
        c31 = new javax.swing.JCheckBox();
        c30 = new javax.swing.JCheckBox();
        c28 = new javax.swing.JCheckBox();
        c27 = new javax.swing.JCheckBox();
        c26 = new javax.swing.JCheckBox();
        c25 = new javax.swing.JCheckBox();
        c24 = new javax.swing.JCheckBox();
        c23 = new javax.swing.JCheckBox();
        c22 = new javax.swing.JCheckBox();
        c21 = new javax.swing.JCheckBox();
        c20 = new javax.swing.JCheckBox();
        c110 = new javax.swing.JCheckBox();
        c111 = new javax.swing.JCheckBox();
        c112 = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        c18 = new javax.swing.JCheckBox();
        c19 = new javax.swing.JCheckBox();
        c46 = new javax.swing.JCheckBox();
        c47 = new javax.swing.JCheckBox();
        c9 = new javax.swing.JCheckBox();
        c44 = new javax.swing.JCheckBox();
        c8 = new javax.swing.JCheckBox();
        c45 = new javax.swing.JCheckBox();
        c7 = new javax.swing.JCheckBox();
        c42 = new javax.swing.JCheckBox();
        c43 = new javax.swing.JCheckBox();
        c40 = new javax.swing.JCheckBox();
        c41 = new javax.swing.JCheckBox();
        c48 = new javax.swing.JCheckBox();
        c49 = new javax.swing.JCheckBox();
        c12 = new javax.swing.JCheckBox();
        c13 = new javax.swing.JCheckBox();
        c10 = new javax.swing.JCheckBox();
        c11 = new javax.swing.JCheckBox();
        c16 = new javax.swing.JCheckBox();
        c17 = new javax.swing.JCheckBox();
        c14 = new javax.swing.JCheckBox();
        c15 = new javax.swing.JCheckBox();
        c55 = new javax.swing.JCheckBox();
        c56 = new javax.swing.JCheckBox();
        c57 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        c58 = new javax.swing.JCheckBox();
        c51 = new javax.swing.JCheckBox();
        c52 = new javax.swing.JCheckBox();
        c53 = new javax.swing.JCheckBox();
        c54 = new javax.swing.JCheckBox();
        c59 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        c50 = new javax.swing.JCheckBox();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c5 = new javax.swing.JCheckBox();
        c6 = new javax.swing.JCheckBox();
        c64 = new javax.swing.JCheckBox();
        c65 = new javax.swing.JCheckBox();
        c62 = new javax.swing.JCheckBox();
        c63 = new javax.swing.JCheckBox();
        c68 = new javax.swing.JCheckBox();
        c69 = new javax.swing.JCheckBox();
        c66 = new javax.swing.JCheckBox();
        c67 = new javax.swing.JCheckBox();
        c61 = new javax.swing.JCheckBox();
        c60 = new javax.swing.JCheckBox();
        c73 = new javax.swing.JCheckBox();
        c74 = new javax.swing.JCheckBox();
        c75 = new javax.swing.JCheckBox();
        c76 = new javax.swing.JCheckBox();
        c77 = new javax.swing.JCheckBox();
        c78 = new javax.swing.JCheckBox();
        c79 = new javax.swing.JCheckBox();
        c70 = new javax.swing.JCheckBox();
        c72 = new javax.swing.JCheckBox();
        c71 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));

        c89.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c89.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c88.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c88.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c87.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c87.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c86.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c86.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c85.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c85.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c84.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c84.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c82.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c82.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c83.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c83.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c80.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c80.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c81.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c81.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c99.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c99.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c96.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c96.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c95.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c95.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c98.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c98.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c97.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c97.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c91.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c91.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c92.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c92.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c93.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c93.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c94.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c94.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c90.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c90.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c109.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c109.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c108.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c108.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c107.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c107.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c106.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c106.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c100.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c100.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c101.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c101.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c104.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c104.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c105.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c105.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c39.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c39.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c102.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c102.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c38.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c38.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c103.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c103.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c37.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c37.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c36.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c36.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c35.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c35.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c34.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c34.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c33.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c33.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c32.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c32.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c29.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c29.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c31.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c31.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c30.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c30.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c28.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c28.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c27.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c27.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c26.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c26.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c25.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c25.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c24.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c24.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c23.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c23.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c22.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c22.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c21.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c21.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c20.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c20.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c110.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c110.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c111.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c111.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c112.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c112.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        c18.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c18.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c19.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c19.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c46.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c46.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c47.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c47.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c9.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c44.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c44.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c45.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c45.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c42.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c42.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c43.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c43.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c40.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c40.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c41.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c41.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c48.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c48.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c49.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c49.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c12.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c12.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c13.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c13.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c10.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c11.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c11.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c16.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c16.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c17.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c17.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c14.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c14.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c15.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c15.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c55.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c55.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c56.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c56.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c57.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c57.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c58.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c58.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c51.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c51.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c52.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c52.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c53.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c53.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c54.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c54.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c59.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c59.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("S  C  R  E  E  N    T  H  I  S    S  I  D  E");

        c50.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c50.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c1.setHideActionText(true);
        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c64.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c64.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c65.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c65.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c62.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c62.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c63.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c63.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c68.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c68.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c69.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c69.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c66.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c66.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c67.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c67.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c61.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c61.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c60.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c60.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c73.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c73.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c74.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c74.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c75.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c75.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c76.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c76.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c77.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c77.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c78.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c78.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c79.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c79.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c70.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c70.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c72.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c72.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        c71.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Booked3.png"))); // NOI18N
        c71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Available4.png"))); // NOI18N
        c71.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Chosen3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(c1)
                                .addGap(18, 18, 18)
                                .addComponent(c2)
                                .addGap(18, 18, 18)
                                .addComponent(c3)
                                .addGap(18, 18, 18)
                                .addComponent(c4)
                                .addGap(18, 18, 18)
                                .addComponent(c5)
                                .addGap(18, 18, 18)
                                .addComponent(c6)
                                .addGap(18, 18, 18)
                                .addComponent(c7)
                                .addGap(18, 18, 18)
                                .addComponent(c14)
                                .addGap(18, 18, 18)
                                .addComponent(c8)
                                .addGap(18, 18, 18)
                                .addComponent(c9)
                                .addGap(18, 18, 18)
                                .addComponent(c10)
                                .addGap(18, 18, 18)
                                .addComponent(c11)
                                .addGap(18, 18, 18)
                                .addComponent(c12)
                                .addGap(18, 18, 18)
                                .addComponent(c13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(c24)
                                .addGap(18, 18, 18)
                                .addComponent(c16)
                                .addGap(18, 18, 18)
                                .addComponent(c18)
                                .addGap(18, 18, 18)
                                .addComponent(c20)
                                .addGap(18, 18, 18)
                                .addComponent(c21)
                                .addGap(18, 18, 18)
                                .addComponent(c22)
                                .addGap(18, 18, 18)
                                .addComponent(c23)
                                .addGap(18, 18, 18)
                                .addComponent(c19)
                                .addGap(18, 18, 18)
                                .addComponent(c25)
                                .addGap(18, 18, 18)
                                .addComponent(c26)
                                .addGap(18, 18, 18)
                                .addComponent(c27)
                                .addGap(18, 18, 18)
                                .addComponent(c28)
                                .addGap(18, 18, 18)
                                .addComponent(c15)
                                .addGap(18, 18, 18)
                                .addComponent(c17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(c94)
                                    .addGap(18, 18, 18)
                                    .addComponent(c86)
                                    .addGap(18, 18, 18)
                                    .addComponent(c88)
                                    .addGap(18, 18, 18)
                                    .addComponent(c90)
                                    .addGap(18, 18, 18)
                                    .addComponent(c91)
                                    .addGap(18, 18, 18)
                                    .addComponent(c92)
                                    .addGap(18, 18, 18)
                                    .addComponent(c93)
                                    .addGap(18, 18, 18)
                                    .addComponent(c89)
                                    .addGap(18, 18, 18)
                                    .addComponent(c95)
                                    .addGap(18, 18, 18)
                                    .addComponent(c96)
                                    .addGap(18, 18, 18)
                                    .addComponent(c97)
                                    .addGap(18, 18, 18)
                                    .addComponent(c98)
                                    .addGap(18, 18, 18)
                                    .addComponent(c85)
                                    .addGap(18, 18, 18)
                                    .addComponent(c87))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(c108)
                                    .addGap(18, 18, 18)
                                    .addComponent(c100)
                                    .addGap(18, 18, 18)
                                    .addComponent(c102)
                                    .addGap(18, 18, 18)
                                    .addComponent(c104)
                                    .addGap(18, 18, 18)
                                    .addComponent(c105)
                                    .addGap(18, 18, 18)
                                    .addComponent(c106)
                                    .addGap(18, 18, 18)
                                    .addComponent(c107)
                                    .addGap(18, 18, 18)
                                    .addComponent(c103)
                                    .addGap(18, 18, 18)
                                    .addComponent(c109)
                                    .addGap(18, 18, 18)
                                    .addComponent(c110)
                                    .addGap(18, 18, 18)
                                    .addComponent(c111)
                                    .addGap(18, 18, 18)
                                    .addComponent(c112)
                                    .addGap(18, 18, 18)
                                    .addComponent(c99)
                                    .addGap(18, 18, 18)
                                    .addComponent(c101))
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(c52)
                                        .addGap(18, 18, 18)
                                        .addComponent(c44)
                                        .addGap(18, 18, 18)
                                        .addComponent(c46)
                                        .addGap(18, 18, 18)
                                        .addComponent(c48)
                                        .addGap(18, 18, 18)
                                        .addComponent(c49)
                                        .addGap(18, 18, 18)
                                        .addComponent(c50)
                                        .addGap(18, 18, 18)
                                        .addComponent(c51)
                                        .addGap(18, 18, 18)
                                        .addComponent(c47)
                                        .addGap(18, 18, 18)
                                        .addComponent(c53)
                                        .addGap(18, 18, 18)
                                        .addComponent(c54)
                                        .addGap(18, 18, 18)
                                        .addComponent(c55)
                                        .addGap(18, 18, 18)
                                        .addComponent(c56)
                                        .addGap(18, 18, 18)
                                        .addComponent(c43)
                                        .addGap(18, 18, 18)
                                        .addComponent(c45))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(c66)
                                        .addGap(18, 18, 18)
                                        .addComponent(c58)
                                        .addGap(18, 18, 18)
                                        .addComponent(c60)
                                        .addGap(18, 18, 18)
                                        .addComponent(c62)
                                        .addGap(18, 18, 18)
                                        .addComponent(c63)
                                        .addGap(18, 18, 18)
                                        .addComponent(c64)
                                        .addGap(18, 18, 18)
                                        .addComponent(c65)
                                        .addGap(18, 18, 18)
                                        .addComponent(c61)
                                        .addGap(18, 18, 18)
                                        .addComponent(c67)
                                        .addGap(18, 18, 18)
                                        .addComponent(c68)
                                        .addGap(18, 18, 18)
                                        .addComponent(c69)
                                        .addGap(18, 18, 18)
                                        .addComponent(c70)
                                        .addGap(18, 18, 18)
                                        .addComponent(c57)
                                        .addGap(18, 18, 18)
                                        .addComponent(c59))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(c80)
                                        .addGap(18, 18, 18)
                                        .addComponent(c72)
                                        .addGap(18, 18, 18)
                                        .addComponent(c74)
                                        .addGap(18, 18, 18)
                                        .addComponent(c76)
                                        .addGap(18, 18, 18)
                                        .addComponent(c77)
                                        .addGap(18, 18, 18)
                                        .addComponent(c78)
                                        .addGap(18, 18, 18)
                                        .addComponent(c79)
                                        .addGap(18, 18, 18)
                                        .addComponent(c75)
                                        .addGap(18, 18, 18)
                                        .addComponent(c81)
                                        .addGap(18, 18, 18)
                                        .addComponent(c82)
                                        .addGap(18, 18, 18)
                                        .addComponent(c83)
                                        .addGap(18, 18, 18)
                                        .addComponent(c84)
                                        .addGap(18, 18, 18)
                                        .addComponent(c71)
                                        .addGap(18, 18, 18)
                                        .addComponent(c73))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(c38)
                                        .addGap(18, 18, 18)
                                        .addComponent(c30)
                                        .addGap(18, 18, 18)
                                        .addComponent(c32)
                                        .addGap(18, 18, 18)
                                        .addComponent(c34)
                                        .addGap(18, 18, 18)
                                        .addComponent(c35)
                                        .addGap(18, 18, 18)
                                        .addComponent(c36)
                                        .addGap(18, 18, 18)
                                        .addComponent(c37)
                                        .addGap(18, 18, 18)
                                        .addComponent(c33)
                                        .addGap(18, 18, 18)
                                        .addComponent(c39)
                                        .addGap(18, 18, 18)
                                        .addComponent(c40)
                                        .addGap(18, 18, 18)
                                        .addComponent(c41)
                                        .addGap(18, 18, 18)
                                        .addComponent(c42)
                                        .addGap(18, 18, 18)
                                        .addComponent(c29)
                                        .addGap(18, 18, 18)
                                        .addComponent(c31)))))
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(c24)
                        .addComponent(c21, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c22, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c23, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c25, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c19)
                            .addComponent(c28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c17, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(c26, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c27, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(c18)
                    .addComponent(c20))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c30)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(c38)
                        .addComponent(c35, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c36, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c37, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c39, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c33)
                            .addComponent(c42, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c29, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c31, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(c40, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c41, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(c32)
                    .addComponent(c34))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c44)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(c52)
                        .addComponent(c49, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c50, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c51, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c53, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c47)
                            .addComponent(c56, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c43, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c45, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(c54, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c55, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(c46)
                    .addComponent(c48))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c58)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(c66)
                        .addComponent(c63, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c64, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c65, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c67, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c61)
                            .addComponent(c70, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c57, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c59, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(c68, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c69, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(c60)
                    .addComponent(c62))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c72)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(c80)
                        .addComponent(c77, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c78, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c79, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c81, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c75)
                            .addComponent(c84, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c71, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c73, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(c82, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c83, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(c74)
                    .addComponent(c76))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c86)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(c94)
                        .addComponent(c91, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c92, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c93, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c95, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c89)
                            .addComponent(c98, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c85, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c87, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(c96, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c97, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(c88)
                    .addComponent(c90))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c100)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(c108)
                        .addComponent(c105, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c106, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c107, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c109, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c103)
                            .addComponent(c112, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c99, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c101, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(c110, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(c111, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(c102)
                    .addComponent(c104))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:  
        String CustId = jLabel2.getText();
        Long ShowId = Long.parseLong(jLabel3.getText());
        //BOOKING
        if (c1.isSelected()) {
            book(CustId, ShowId, 1);
        }
        if (c2.isSelected()) {
            book(CustId, ShowId, 2);
        }
        if (c3.isSelected()) {
            book(CustId, ShowId, 3);
        }
        if (c4.isSelected()) {
            book(CustId, ShowId, 4);
        }
        if (c5.isSelected()) {
            book(CustId, ShowId, 5);
        }
        if (c6.isSelected()) {
            book(CustId, ShowId, 6);
        }
        if (c7.isSelected()) {
            book(CustId, ShowId, 7);
        }
        if (c8.isSelected()) {
            book(CustId, ShowId, 8);
        }
        if (c9.isSelected()) {
            book(CustId, ShowId, 9);
        }
        if (c10.isSelected()) {
            book(CustId, ShowId, 10);
        }
        if (c11.isSelected()) {
            book(CustId, ShowId, 11);
        }
        if (c12.isSelected()) {
            book(CustId, ShowId, 12);
        }
        if (c13.isSelected()) {
            book(CustId, ShowId, 13);
        }
        if (c14.isSelected()) {
            book(CustId, ShowId, 14);
        }
        if (c15.isSelected()) {
            book(CustId, ShowId, 15);
        }
        if (c16.isSelected()) {
            book(CustId, ShowId, 16);
        }
        if (c17.isSelected()) {
            book(CustId, ShowId, 17);
        }
        if (c18.isSelected()) {
            book(CustId, ShowId, 18);
        }
        if (c19.isSelected()) {
            book(CustId, ShowId, 19);
        }
        if (c20.isSelected()) {
            book(CustId, ShowId, 20);
        }
        if (c21.isSelected()) {
            book(CustId, ShowId, 21);
        }
        if (c22.isSelected()) {
            book(CustId, ShowId, 22);
        }
        if (c23.isSelected()) {
            book(CustId, ShowId, 23);
        }
        if (c24.isSelected()) {
            book(CustId, ShowId, 24);
        }
        if (c25.isSelected()) {
            book(CustId, ShowId, 25);
        }
        if (c26.isSelected()) {
            book(CustId, ShowId, 26);
        }
        if (c27.isSelected()) {
            book(CustId, ShowId, 27);
        }
        if (c28.isSelected()) {
            book(CustId, ShowId, 28);
        }
        if (c29.isSelected()) {
            book(CustId, ShowId, 29);
        }
        if (c30.isSelected()) {
            book(CustId, ShowId, 30);
        }
        if (c31.isSelected()) {
            book(CustId, ShowId, 31);
        }
        if (c32.isSelected()) {
            book(CustId, ShowId, 32);
        }
        if (c33.isSelected()) {
            book(CustId, ShowId, 33);
        }
        if (c34.isSelected()) {
            book(CustId, ShowId, 34);
        }
        if (c35.isSelected()) {
            book(CustId, ShowId, 35);
        }
        if (c36.isSelected()) {
            book(CustId, ShowId, 36);
        }
        if (c37.isSelected()) {
            book(CustId, ShowId, 37);
        }
        if (c38.isSelected()) {
            book(CustId, ShowId, 38);
        }
        if (c39.isSelected()) {
            book(CustId, ShowId, 39);
        }
        if (c40.isSelected()) {
            book(CustId, ShowId, 40);
        }
        if (c41.isSelected()) {
            book(CustId, ShowId, 41);
        }
        if (c42.isSelected()) {
            book(CustId, ShowId, 42);
        }
        if (c43.isSelected()) {
            book(CustId, ShowId, 43);
        }
        if (c44.isSelected()) {
            book(CustId, ShowId, 44);
        }
        if (c45.isSelected()) {
            book(CustId, ShowId, 45);
        }
        if (c46.isSelected()) {
            book(CustId, ShowId, 46);
        }
        if (c47.isSelected()) {
            book(CustId, ShowId, 47);
        }
        if (c48.isSelected()) {
            book(CustId, ShowId, 48);
        }
        if (c49.isSelected()) {
            book(CustId, ShowId, 49);
        }
        if (c50.isSelected()) {
            book(CustId, ShowId, 50);
        }
        if (c51.isSelected()) {
            book(CustId, ShowId, 51);
        }
        if (c52.isSelected()) {
            book(CustId, ShowId, 52);
        }
        if (c53.isSelected()) {
            book(CustId, ShowId, 53);
        }
        if (c54.isSelected()) {
            book(CustId, ShowId, 54);
        }
        if (c55.isSelected()) {
            book(CustId, ShowId, 55);
        }
        if (c56.isSelected()) {
            book(CustId, ShowId, 56);
        }
        if (c57.isSelected()) {
            book(CustId, ShowId, 57);
        }
        if (c58.isSelected()) {
            book(CustId, ShowId, 58);
        }
        if (c59.isSelected()) {
            book(CustId, ShowId, 59);
        }
        if (c60.isSelected()) {
            book(CustId, ShowId, 60);
        }
        if (c61.isSelected()) {
            book(CustId, ShowId, 61);
        }
        if (c62.isSelected()) {
            book(CustId, ShowId, 62);
        }
        if (c63.isSelected()) {
            book(CustId, ShowId, 63);
        }
        if (c64.isSelected()) {
            book(CustId, ShowId, 64);
        }
        if (c65.isSelected()) {
            book(CustId, ShowId, 65);
        }
        if (c66.isSelected()) {
            book(CustId, ShowId, 66);
        }
        if (c67.isSelected()) {
            book(CustId, ShowId, 67);
        }
        if (c68.isSelected()) {
            book(CustId, ShowId, 68);
        }
        if (c69.isSelected()) {
            book(CustId, ShowId, 69);
        }
        if (c70.isSelected()) {
            book(CustId, ShowId, 70);
        }
        if (c71.isSelected()) {
            book(CustId, ShowId, 71);
        }
        if (c72.isSelected()) {
            book(CustId, ShowId, 72);
        }
        if (c73.isSelected()) {
            book(CustId, ShowId, 73);
        }
        if (c74.isSelected()) {
            book(CustId, ShowId, 74);
        }
        if (c75.isSelected()) {
            book(CustId, ShowId, 75);
        }
        if (c76.isSelected()) {
            book(CustId, ShowId, 76);
        }
        if (c77.isSelected()) {
            book(CustId, ShowId, 77);
        }
        if (c78.isSelected()) {
            book(CustId, ShowId, 78);
        }
        if (c79.isSelected()) {
            book(CustId, ShowId, 79);
        }
        if (c80.isSelected()) {
            book(CustId, ShowId, 80);
        }
        if (c81.isSelected()) {
            book(CustId, ShowId, 81);
        }
        if (c82.isSelected()) {
            book(CustId, ShowId, 82);
        }
        if (c83.isSelected()) {
            book(CustId, ShowId, 83);
        }
        if (c84.isSelected()) {
            book(CustId, ShowId, 84);
        }
        if (c85.isSelected()) {
            book(CustId, ShowId, 85);
        }
        if (c86.isSelected()) {
            book(CustId, ShowId, 86);
        }
        if (c87.isSelected()) {
            book(CustId, ShowId, 87);
        }
        if (c88.isSelected()) {
            book(CustId, ShowId, 88);
        }
        if (c89.isSelected()) {
            book(CustId, ShowId, 89);
        }
        if (c90.isSelected()) {
            book(CustId, ShowId, 90);
        }
        if (c91.isSelected()) {
            book(CustId, ShowId, 91);
        }
        if (c92.isSelected()) {
            book(CustId, ShowId, 92);
        }
        if (c93.isSelected()) {
            book(CustId, ShowId, 93);
        }
        if (c94.isSelected()) {
            book(CustId, ShowId, 94);
        }
        if (c95.isSelected()) {
            book(CustId, ShowId, 95);
        }
        if (c96.isSelected()) {
            book(CustId, ShowId, 96);
        }
        if (c97.isSelected()) {
            book(CustId, ShowId, 97);
        }
        if (c98.isSelected()) {
            book(CustId, ShowId, 98);
        }
        if (c99.isSelected()) {
            book(CustId, ShowId, 99);
        }
        if (c100.isSelected()) {
            book(CustId, ShowId, 100);
        }
        if (c101.isSelected()) {
            book(CustId, ShowId, 101);
        }
        if (c102.isSelected()) {
            book(CustId, ShowId, 102);
        }
        if (c103.isSelected()) {
            book(CustId, ShowId, 103);
        }
        if (c104.isSelected()) {
            book(CustId, ShowId, 104);
        }
        if (c105.isSelected()) {
            book(CustId, ShowId, 105);
        }
        if (c106.isSelected()) {
            book(CustId, ShowId, 106);
        }
        if (c107.isSelected()) {
            book(CustId, ShowId, 107);
        }
        if (c108.isSelected()) {
            book(CustId, ShowId, 108);
        }
        if (c109.isSelected()) {
            book(CustId, ShowId, 109);
        }
        if (c110.isSelected()) {
            book(CustId, ShowId, 110);
        }
        if (c111.isSelected()) {
            book(CustId, ShowId, 111);
        }
        if (c112.isSelected()) {
            book(CustId, ShowId, 112);
        }
        
       
            new Snacks().setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html */
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selectseat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selectseat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c10;
    private javax.swing.JCheckBox c100;
    private javax.swing.JCheckBox c101;
    private javax.swing.JCheckBox c102;
    private javax.swing.JCheckBox c103;
    private javax.swing.JCheckBox c104;
    private javax.swing.JCheckBox c105;
    private javax.swing.JCheckBox c106;
    private javax.swing.JCheckBox c107;
    private javax.swing.JCheckBox c108;
    private javax.swing.JCheckBox c109;
    private javax.swing.JCheckBox c11;
    private javax.swing.JCheckBox c110;
    private javax.swing.JCheckBox c111;
    private javax.swing.JCheckBox c112;
    private javax.swing.JCheckBox c12;
    private javax.swing.JCheckBox c13;
    private javax.swing.JCheckBox c14;
    private javax.swing.JCheckBox c15;
    private javax.swing.JCheckBox c16;
    private javax.swing.JCheckBox c17;
    private javax.swing.JCheckBox c18;
    private javax.swing.JCheckBox c19;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c20;
    private javax.swing.JCheckBox c21;
    private javax.swing.JCheckBox c22;
    private javax.swing.JCheckBox c23;
    private javax.swing.JCheckBox c24;
    private javax.swing.JCheckBox c25;
    private javax.swing.JCheckBox c26;
    private javax.swing.JCheckBox c27;
    private javax.swing.JCheckBox c28;
    private javax.swing.JCheckBox c29;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c30;
    private javax.swing.JCheckBox c31;
    private javax.swing.JCheckBox c32;
    private javax.swing.JCheckBox c33;
    private javax.swing.JCheckBox c34;
    private javax.swing.JCheckBox c35;
    private javax.swing.JCheckBox c36;
    private javax.swing.JCheckBox c37;
    private javax.swing.JCheckBox c38;
    private javax.swing.JCheckBox c39;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c40;
    private javax.swing.JCheckBox c41;
    private javax.swing.JCheckBox c42;
    private javax.swing.JCheckBox c43;
    private javax.swing.JCheckBox c44;
    private javax.swing.JCheckBox c45;
    private javax.swing.JCheckBox c46;
    private javax.swing.JCheckBox c47;
    private javax.swing.JCheckBox c48;
    private javax.swing.JCheckBox c49;
    private javax.swing.JCheckBox c5;
    private javax.swing.JCheckBox c50;
    private javax.swing.JCheckBox c51;
    private javax.swing.JCheckBox c52;
    private javax.swing.JCheckBox c53;
    private javax.swing.JCheckBox c54;
    private javax.swing.JCheckBox c55;
    private javax.swing.JCheckBox c56;
    private javax.swing.JCheckBox c57;
    private javax.swing.JCheckBox c58;
    private javax.swing.JCheckBox c59;
    private javax.swing.JCheckBox c6;
    private javax.swing.JCheckBox c60;
    private javax.swing.JCheckBox c61;
    private javax.swing.JCheckBox c62;
    private javax.swing.JCheckBox c63;
    private javax.swing.JCheckBox c64;
    private javax.swing.JCheckBox c65;
    private javax.swing.JCheckBox c66;
    private javax.swing.JCheckBox c67;
    private javax.swing.JCheckBox c68;
    private javax.swing.JCheckBox c69;
    private javax.swing.JCheckBox c7;
    private javax.swing.JCheckBox c70;
    private javax.swing.JCheckBox c71;
    private javax.swing.JCheckBox c72;
    private javax.swing.JCheckBox c73;
    private javax.swing.JCheckBox c74;
    private javax.swing.JCheckBox c75;
    private javax.swing.JCheckBox c76;
    private javax.swing.JCheckBox c77;
    private javax.swing.JCheckBox c78;
    private javax.swing.JCheckBox c79;
    private javax.swing.JCheckBox c8;
    private javax.swing.JCheckBox c80;
    private javax.swing.JCheckBox c81;
    private javax.swing.JCheckBox c82;
    private javax.swing.JCheckBox c83;
    private javax.swing.JCheckBox c84;
    private javax.swing.JCheckBox c85;
    private javax.swing.JCheckBox c86;
    private javax.swing.JCheckBox c87;
    private javax.swing.JCheckBox c88;
    private javax.swing.JCheckBox c89;
    private javax.swing.JCheckBox c9;
    private javax.swing.JCheckBox c90;
    private javax.swing.JCheckBox c91;
    private javax.swing.JCheckBox c92;
    private javax.swing.JCheckBox c93;
    private javax.swing.JCheckBox c94;
    private javax.swing.JCheckBox c95;
    private javax.swing.JCheckBox c96;
    private javax.swing.JCheckBox c97;
    private javax.swing.JCheckBox c98;
    private javax.swing.JCheckBox c99;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
