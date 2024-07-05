/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades.OrdenEntity;
import entidades.OrdenPlatilloEntity;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jesus
 */
public class OrdenPlatilloDaoImpl implements IDao<OrdenPlatilloEntity>{
    private EntityManagerFactory emf;
    private EntityManager em;

    public OrdenPlatilloDaoImpl() {
        this.emf = Persistence.createEntityManagerFactory("default");
        this.em = emf.createEntityManager();
    }

    @Override
    public void crear(OrdenPlatilloEntity entidad) {
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        System.out.println("Se a agregado el platillo a la base de datos exitosamente.");
    }

    @Override
    public Optional<OrdenPlatilloEntity> obtenerPorId(long id) {
        OrdenPlatilloEntity orden = em.find(OrdenPlatilloEntity.class, id);
        return orden != null ? Optional.of(orden) : Optional.empty();
    }

    @Override
    public List<OrdenPlatilloEntity> obtenerTodos() {
        return em.createQuery("SELECT p FROM OrdenPlatilloEntity p", OrdenPlatilloEntity.class).getResultList();
    }

    @Override
    public void actualizar(OrdenPlatilloEntity entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
