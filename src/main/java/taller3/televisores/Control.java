package taller3.televisores;

public class Control {
    TV tv;

    public void enlazar(TV tv) {
        tv.setControl(this);
        this.tv=tv;
    }

    public TV getTv() {
        return tv;
    }
    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void turnOn() {
        tv.turnOn();
    }
    public void turnOff() {
        tv.turnOff();
    }

    public void canalUp() {
        if (tv.getEstado()==true) {
            if (tv.getCanal()>=1 && tv.getCanal()<120) {
                tv.setCanal(tv.getCanal()+1);
            }
        }     
    }
    
    public void canalDown() {
        if (tv.getEstado()==true) {
            if (tv.getCanal()>1 && tv.getCanal()<=120) {
                tv.setCanal(tv.getCanal()-1);
            }
        }
    }

    public void volumenUp() {
        if (tv.getEstado()==true) {
            if (tv.getVolumen()>=0 && tv.getVolumen()<7) {
                tv.setVolumen(tv.getVolumen()+1);
            }
        }
    }
    
    public void volumenDown() {
        if (tv.getEstado()==true) {
            if (tv.getVolumen()>0 && tv.getVolumen()<=7) {
                tv.setVolumen(tv.getVolumen()-1);
            }
        }
    }
    
    public void setCanal(int canal) {
    }
}