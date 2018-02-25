package MeteoApp;


/**
* MeteoApp/MeteoHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Meteo.idl
* lundi 12 février 2018 à 13:42:04 heure normale d’Europe centrale
*/

abstract public class MeteoHelper
{
  private static String  _id = "IDL:MeteoApp/Meteo:1.0";

  public static void insert (org.omg.CORBA.Any a, MeteoApp.Meteo that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static MeteoApp.Meteo extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (MeteoApp.MeteoHelper.id (), "Meteo");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static MeteoApp.Meteo read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_MeteoStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, MeteoApp.Meteo value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static MeteoApp.Meteo narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof MeteoApp.Meteo)
      return (MeteoApp.Meteo)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      MeteoApp._MeteoStub stub = new MeteoApp._MeteoStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static MeteoApp.Meteo unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof MeteoApp.Meteo)
      return (MeteoApp.Meteo)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      MeteoApp._MeteoStub stub = new MeteoApp._MeteoStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}