package customer.ZooDeSanti.handlers;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.sap.cds.services.cds.CdsReadEventContext;
import com.sap.cds.services.cds.CdsService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.After;
import com.sap.cds.services.handler.annotations.Before;
import com.sap.cds.services.handler.annotations.ServiceName;
import cds.gen.empleadoservice.EmpleadoService_;

@Component
@ServiceName(EmpleadoService_.CDS_NAME)
public class EmpleadoService implements EventHandler {


    @Before(event = CdsService.EVENT_READ, entity = "EmpleadoService.Empleado")
     public void onRead(CdsReadEventContext context) {
    	
    	System.out.println("Entro");
     }

}