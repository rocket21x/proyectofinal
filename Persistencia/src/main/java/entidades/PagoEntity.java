package entidades;

import javax.persistence.*;

@Entity
@Table(name = "Pagos")
public class PagoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private int id;

    @Column(name = "monto", nullable = false)
    private float monto;

    @Column(name = "descripcion", length = 500)
    private String descripcion;

    @Column(name = "metodo_pago", nullable = false)
    private String metodoPago;

    @Column(name = "fecha", nullable = false)
    private String fecha;

    public PagoEntity(int id, float monto, String metodoPago, String descripcion, String fecha) {
        this.id = id;
        this.monto = monto;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
    }

    public PagoEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
