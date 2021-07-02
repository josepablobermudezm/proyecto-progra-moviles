package com.example.proyecto.utilidades;

public class ListenerTerminado {
    boolean boo = false;

    public ListenerTerminado(boolean b){
        boo = b;
    }

    private listener l = null;

    public interface listener{
        public void onChange(boolean b);
    }

    public void setChangeListener(listener mListener){
        l = mListener;
    }

    public void somethingChanged(){
        if(l != null){
            l.onChange(boo);
        }
    }

}

