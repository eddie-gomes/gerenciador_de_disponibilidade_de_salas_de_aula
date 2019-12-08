package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Laboratorio extends Sala
{
    private int qtd_computadores;
    private int qtd_equipametos;
    private ArrayList <String> tipos_equipamentos = new ArrayList<String>();

    public int getQtd_computadores() 
    {
        return qtd_computadores;
    }

    public void setQtd_computadores(int qtd_computadores) 
    {
        this.qtd_computadores = qtd_computadores;
    }

    public int getQtd_equipametos() 
    {
        return qtd_equipametos;
    }

    public void setQtd_equipametos(int qtd_equipametos) 
    {
        this.qtd_equipametos = qtd_equipametos;
    }

    public ArrayList<String> getTipos_equipamentos() 
    {
        return tipos_equipamentos;
    }

    public void setTipos_equipamentos(ArrayList<String> tipos_equipamentos) 
    {
        this.tipos_equipamentos = tipos_equipamentos;
    }
    
    public Sala cadLab(Predio Pred)//depois criar um diretório apenas para laboratórios e salvar todos os objetos de lab lá também
    {
        int m;
        ArrayList <String> equipList = new ArrayList();
        Scanner cn = new Scanner(System.in);
        this.setPredio(Pred);
        System.out.printf("informe o número da laboratório ");
        this.setIdSala(cn.nextInt());
        System.out.printf("informe a capacidade ");
        this.setCapacidade(cn.nextInt());
        System.out.printf("informe se tem arcondicionado (true/false)");
        this.setAr(cn.nextBoolean());
        System.out.printf("informe se tem projetor (true/false)");
        this.setProjetor(cn.nextBoolean());
        System.out.printf("informe se tem TV (true/false)");
        this.setTv(cn.nextBoolean());
        System.out.printf("informe a quantidade de computadores ");
        this.setQtd_computadores(cn.nextInt());
        System.out.printf("informe a quantidade de equipamentos ");
        m = cn.nextInt();
        this.setQtd_equipametos(m);
        for (int j=0; j<m; j++)
        {
            System.out.printf("informe o tipo de equipamento ");
            equipList.add(cn.next());
        }
        this.setTipos_equipamentos(equipList);
        this.criaDiretSala();
        this.Salvar();
        this.salvarLis();
        
        return this;
    }

}
