//En caso de no querer MVC

//package com.preverisk.ada.spring.mf0493.controladores;
//
//import java.math.BigDecimal;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.preverisk.ada.spring.mf0493.entidades.Inmueble.Tipo;
//import com.preverisk.ada.spring.mf0493.entidades.Visita;
//import com.preverisk.ada.spring.mf0493.entidades.Visita.Status;
//import com.preverisk.ada.spring.mf0493.servicios.InmuebleService;
//import com.preverisk.ada.spring.mf0493.servicios.VisitaService;
//
//@Controller
//@RequestMapping("/")
//public class VisitaController {
//	@Autowired
//	private VisitaService servicio;
//	
////	@GetMapping
////	public String index(Model modelo, String status, BigDecimal min, BigDecimal max, String texto) {
////		Iterable<Visita> inmuebles;
////		
////		if(tipo != null) {
////			inmuebles = servicio.alquilerVentaOTodas(status);
////		} else if(min != null && max != null) {
////			inmuebles = servicio.rangoDePrecio(min, max);
////		} else if(texto != null) {
////			inmuebles = servicio.nombreODireccion(texto);
////		} else {
////			inmuebles = servicio.alquilerVentaOTodas(null);	
////		}
////		
////		modelo.addAttribute("listaInmuebles", inmuebles);
////		return "index";
////	}
////	
////	@GetMapping("/buscador")
////	public String buscador(Model modelo, Tipo tipo, BigDecimal min, BigDecimal max, String texto) {
////		modelo.addAttribute("listaInmuebles", servicio.buscador(min, max, tipo, texto));
////		return "index";
//	}
//}
