package edu.uptc.logic;

public class Node {
    private Node HI;
    private Tupla Data;
    private Node HD;
    
    public Node()
    {
        Data = new Tupla();
        HI = null;
        HD = null;
    }
    public Node( Tupla dat)
    {
        this.Data = dat;
        //this.Data.setValor(dat.getValor());
        //this.Data.setOperador(dat.getOperator());
        this.HI = null;
        this.HD = null;
    }
    
    public Nodo(Nodo Hisq, Tupla dat, Nodo Hder)
    {
        this.Data.setValor(dat.getValor());
        this.Data.setOperador(dat.getOperator());
        this.HI = Hisq;
        this.HD = Hder;
    }
    
    public void setData(Tupla dat)
    {
        this.Data.setValor(dat.getValor());
        this.Data.setOperador(dat.getOperator());
    }
    
    public void setHI(Nodo Hisq)
    {
        this.HI = Hisq;
    }
    
    public void setHD(Nodo Hder)
    {
        this.HD = Hder;
    }
    
    public Tupla getData()
    {
        return this.Data;
    }
    
    public Nodo getHI()
    {
        return this.HI;
    }
    
    public Nodo getHD()
    {
        return this.HD;
    }
    

	
}
