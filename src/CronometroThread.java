/**
 *
 * @modificado por ziero autor original viruz
 */
public class CronometroThread implements Runnable{
private Thread hiloCronometro;
private boolean go,live;
private int segundos=10;
private int Bandera=3;
private int bandera2=0;
public int a;
private Cronometro reloj;

    public CronometroThread(Cronometro v){
        reloj = v;
    }

    public void run() {
        try{
            
            while(isLive()){
                synchronized(this){
                    while(!isGo())
                        wait();
                    }
                    Thread.sleep(1000);
                    if (bandera2==1)
                    {
                        segundos++;
                    }
                    if (bandera2==2)
                    {
                        segundos--;
                    }
                    segundos++;
                   bandera2=0;
                   //  if(Bandera==2)
                  //   segundos2=segundos;
                    actualizarDragon();
                    actualizarBaron();
                     Bandera=3;
                    actualizarThread();
                   
                    
                }
        }catch(InterruptedException e){}
    }
    
    public void createThread(){
        hiloCronometro = new Thread(this);
        hiloCronometro.start();
     }
  public void actualizarDragon(){
        if(Bandera == 2){
            
            int hr= segundos/3600;
            int min =(segundos-hr*3600)/60;
            int seg = segundos-hr*3600-min*60;
            reloj.getDragon().setText(""+hr+" : "+(min+6)+" : "+seg);
            
        }
    }

public void actualizarBaron(){
        if(Bandera == 1){
            
            int hr= segundos/3600;
            int min =(segundos-hr*3600)/60;
            int seg = segundos-hr*3600-min*60;
            reloj.getBaron().setText(""+hr+" : "+(min+7)+" : "+seg);
            
        }
    }
    public void actualizarThread() {
        if(isLive() == true){
            int hr= segundos/3600;
            int min =(segundos-hr*3600)/60;
            int seg = segundos-hr*3600-min*60;
            reloj.getDisplay().setText(""+hr+" : "+min+" : "+seg);

        }else{
            segundos = 0;
            reloj.getDisplay().setText("0 : 0 : 10");
        }
    }
    
    public void suspenderThread(){
        setGo(false);
    }

    public synchronized void continuarThread() {
        setGo(true);
        notify();
    }

    //********** MÉTODOS SET Y GET DE LAS VARIABLES DE TIPO BOOLEAN e INT ************
    /**
     * @return the live
     */
    public boolean isLive() {
        return live;
    }

    /**
     * @param live the live to set
     */
    public void setLive(boolean live) {
        this.live = live;
    }

    /**
     * @return the go
     */
    public boolean isGo() {
        return go;
    }

    /**
     * @param go the go to set
     */
    public void setGo(boolean go) {
        this.go = go;
    }

    /**
     * @return the segundos
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * @param segundos the segundos to set
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
        System.out.println("Valor de SEgundos:" + this.segundos);
    }
     public void setBandera(int Bandera) {
        this.Bandera = Bandera;
        System.out.println("Valor de bandera:" + this.Bandera);
    }
      public void setBandera2(int bandera2) {
        this.bandera2 = bandera2;
        System.out.println("Valor de bandera2:" + this.bandera2);
    }
}