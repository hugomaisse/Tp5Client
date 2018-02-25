package MeteoClient;

import MeteoApp.Meteo;
import MeteoApp.MeteoHelper;

import java.util.Properties;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class Main {
	public static void main(String[] args) {
		try{
			Properties props = new Properties();
			props.put("org.omg.CORBA.ORBInitialPort", "9999");
			ORB orb = ORB.init(args,props);
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
			Meteo meteoobj = (Meteo) MeteoHelper.narrow(ncRef.resolve_str("ABC"));

			System.out.println("Welcome to system: ");

			//String r = meteoobj.afficherBulletincourant();
			System.out.println("La météo est : " + meteoobj.afficherBulletincourant());
			System.out.println("-----------------------");

		}catch (Exception e) {
			System.out.println("exception"+ e);
		}

	}
}
