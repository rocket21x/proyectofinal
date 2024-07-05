package daos;

import objetoNegocio.Pago;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PagoDaoImpl implements IDao<Pago>{

   private EntityManagerFactory emf;
    private EntityManager em;

    public PagoDaoImpl() {
        this.emf = Persistence.createEntityManagerFactory("default");
        this.em = emf.createEntityManager();
    }

    @Override
    public void crear(Pago entidad) {
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        System.out.println("Se ha agregado el pago a la base de datos exitosamente.");
    }

    @Override
    public Optional<Pago> obtenerPorId(long id) {
        Pago pago = em.find(Pago.class, id);
        return pago != null ? Optional.of(pago) : Optional.empty();
    }

    @Override
    public List<Pago> obtenerTodos() {
        return em.createQuery("FROM Pago", Pago.class).getResultList();
    }

    @Override
    public void actualizar(Pago entidad) {
        em.getTransaction().begin();
        em.merge(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(long id) {
        em.getTransaction().begin();
        Pago pago = em.find(Pago.class, id);
        if (pago != null) {
            em.remove(pago);
        }
        em.getTransaction().commit();
    }
}