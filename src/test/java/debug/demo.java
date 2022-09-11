package debug;

import com.zendesk.maxwell.Maxwell;
import com.zendesk.maxwell.MaxwellConfig;

import java.net.URISyntaxException;
import java.sql.SQLException;

public class demo {
	public static void main(String[] args) throws SQLException, URISyntaxException {
		MaxwellConfig config =new MaxwellConfig();
		config.maxwellMysql.user="root";
		config.maxwellMysql.password="root";
		Maxwell maxwell = new Maxwell(config);
		maxwell.run();
	}
}
