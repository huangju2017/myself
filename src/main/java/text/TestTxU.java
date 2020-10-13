package text;

import java.sql.Connection;
import java.sql.SQLException;

import com.hj.studentcc.util.TxDBUtils;
/**
 * @Author: HuangJu
 * @Date: 2020/9/26 10:31
 * @Description:
 */
public class TestTxU {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = TxDBUtils.getSource().getConnection();
            System.out.println(connection);
            TxDBUtils.release();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
