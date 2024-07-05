
package dtos;

import java.util.List;
import objetoNegocio.OrdenPlatillo;

public class OrdenDTO {
    
    private long id;
    private int numeroMesa;
    private int numeroOrden;
    private String notas;
    private String estado;
    private Double total;
    
    private List<OrdenPlatillo> ordenPlatillos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    
    
    public List<OrdenPlatillo> getOrdenPlatillos() {
        return ordenPlatillos;
    }

    public void setOrdenPlatillos(List<OrdenPlatillo> ordenPlatillos) {
        this.ordenPlatillos = ordenPlatillos;
    }


    
}
