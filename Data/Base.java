import java.sql.*;

class Base extends Data {

    private Connection getConnect() throws SQLException {

        String connection = "jdbc:mysql://" + bdHost + ":" + bdPort + "/" + bdName +
                "?verifyServerCertificate=false"+
                "&useSSL=false"+
                "&requireSSL=false"+
                "&useLegacyDatetimeCode=false"+
                "&amp"+
                "&serverTimezone=UTC";
        return DriverManager.getConnection(connection, bdLogin, bdPassword);
    }

    void authUser(String name, String email) throws SQLException, ClassNotFoundException {

        String insert = "INSERT INTO " + Config.TABLE + "(" + Config.NAME_COLUMN + "," + Config.EMAIL_COLUMN + ")" + "VALUES(?,?)";
        PreparedStatement pr = getConnect().prepareStatement(insert);
        pr.setString(1, name);
        pr.setString(2, email);
        pr.executeUpdate();

    }

    ResultSet getUser(String email) throws SQLException, ClassNotFoundException {

        String select = "SELECT * FROM " + Config.TABLE + " WHERE " + Config.EMAIL_COLUMN + "=?";
        PreparedStatement pr = getConnect().prepareStatement(select);
        pr.setString(1, email);
        return pr.executeQuery();
    }
}
