import javax.swing.JOptionPane;
                /*------------------------------------------------------------*/
        public class Wizard {
 
           public static void main( String args[] )
           {
              String strDia;
              String strMes;
              int intDia;  
              int suma;
              int resto;                   
              strDia = JOptionPane.showInputDialog( "Ingrese el dia" );
              strMes = JOptionPane.showInputDialog( "Ingrese el mes" );
              intDia = Integer.parseInt( strDia );
             
              /*------------------------------------------------------------*/
              int Month=0;
             
              //enero
              if (strMes.equalsIgnoreCase("enero") == true){ Month=6; }
              //febrero
              else if (strMes.equalsIgnoreCase("febrero") == true){ Month=2; }
             //marzo
              else if (strMes.equalsIgnoreCase("marzo") == true){ Month=3; }
             //abril
              else if (strMes.equalsIgnoreCase("abril") == true){ Month=6; }
              //mayo
              else if (strMes.equalsIgnoreCase("mayo") == true){ Month=1; }
              //junio
              else if (strMes.equalsIgnoreCase("junio") == true){ Month=4; }
              //julio
              else if (strMes.equalsIgnoreCase("julio") == true){ Month=6; }
              //agosto
              else if (strMes.equalsIgnoreCase("agosto") == true){ Month=2; }
              //septiembre
              else if (strMes.equalsIgnoreCase("septiembre") == true){ Month=5; }
              //octubre
              else if (strMes.equalsIgnoreCase("octubre") == true){ Month=0; }
              //noviembre
              else if (strMes.equalsIgnoreCase("noviembre") == true){ Month=3; }
              //diciembre
              else if (strMes.equalsIgnoreCase("diciembre") == true){ Month=5; }
              else{
JOptionPane.showMessageDialog(null, "INGRESE UN MES VALIDO", "ERROR MES",JOptionPane.PLAIN_MESSAGE );
              System.exit(0);}
             
              /*------------------------------------------------------------*/  
           //operaciones  
           suma= intDia + Month;
           resto= suma % 7;     //el residuo de la division me da el codigo del dia
           //SWITCH DE LOS DIAS
           switch(resto){
           case 1:
                   JOptionPane.showMessageDialog(null, "LUNES", "Es Un: ",JOptionPane.PLAIN_MESSAGE );
                   break;
 
           case 2:
                   JOptionPane.showMessageDialog(null, "MARTES", "Es Un: ",JOptionPane.PLAIN_MESSAGE );
                   break;
 
           case 3:
                   JOptionPane.showMessageDialog(null, "MIERCOLES", "Es Un: ",JOptionPane.PLAIN_MESSAGE );
                   break;
 
           case 4:
                   JOptionPane.showMessageDialog(null, "JUEVES", "Es Un: ",JOptionPane.PLAIN_MESSAGE );
                   break;
 
           case 5:
                   JOptionPane.showMessageDialog(null, "VIERNES", "Es Un: ",JOptionPane.PLAIN_MESSAGE );
                   break;
 
           case 6:
                   JOptionPane.showMessageDialog(null, "SABADO", "Es Un: ",JOptionPane.PLAIN_MESSAGE );
                   break;
 
           case 0:
                   JOptionPane.showMessageDialog(null, "DOMINGO", "Es Un: ",JOptionPane.PLAIN_MESSAGE );
                   break;
 
           default: break;
           }
           
        }
}
