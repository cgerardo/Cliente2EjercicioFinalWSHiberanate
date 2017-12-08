/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.pcamacho.model.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;
import utng.pcamacho.services.webservices.Libros;
import utng.pcamacho.services.webservices.LibrosWS_Service;

/**
 *
 * @author gerar
 */
@Named(value = "librosBean")
@SessionScoped
public class LibrosBean implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/EjercicioFinal/LibrosWS.wsdl")
    private LibrosWS_Service service;

    /**
     * Creates a new instance of LibrosBean
     */
    
    private Integer codigo;
    private String titulo;
    private String autor;
    private String editorial;
    private String edicion;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    
    public LibrosBean() {
    }
    
    public String guardarLibro(){
        String msj = ingresarLibros(codigo, titulo, autor, editorial, edicion);
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, msj, "...");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        limpiarForm();
        return "index";
    }
    
    public String buscarLibro(){
        String msj = buscarLibros(codigo);
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, msj, "...");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        limpiarForm();
        return "index";
    }
    
    public List<Libros> getListaLibros(){
        List<Libros> lista = consultarLibros();
        return lista;
    }
    
    public void limpiarForm(){
        this.codigo=0;
        this.titulo="";
        this.autor="";
        this.editorial="";
        this.edicion="";
    }
    private String buscarLibros(int codigo) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        utng.pcamacho.services.webservices.LibrosWS port = service.getLibrosWSPort();
        return port.buscarLibros(codigo);
    }

    private java.util.List<utng.pcamacho.services.webservices.Libros> consultarLibros() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        utng.pcamacho.services.webservices.LibrosWS port = service.getLibrosWSPort();
        return port.consultarLibros();
    }

    private String ingresarLibros(int codigo, java.lang.String titulo, java.lang.String autor, java.lang.String editorial, java.lang.String edicion) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        utng.pcamacho.services.webservices.LibrosWS port = service.getLibrosWSPort();
        return port.ingresarLibros(codigo, titulo, autor, editorial, edicion);
    }
    
}
