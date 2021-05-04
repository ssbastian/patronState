
package co.unicauca.ordermanagement.domain.states;

import co.unicauca.ordermanagement.domain.Order;

/**
 *  Estado Pagado
 * 
 *  @author Sergio Erazo
 * 
 */
public class PayedStated extends OrderState{

    /**
     * constructor
     * 
     * @param order 
     */
    public PayedStated(Order order) {
        super(order);
    }
    
    /**
     * Descripción
     * 
     * @return estado
     */
    @Override
    public String getStateDescription() {
        return "Pagada";
    }
    
    /**
     * Realiza el enlace con la secuencia segun las reglas de negocio
     * 
     * @param parcelNumber
     * @return 
     */
    @Override
    public OrderState orderSendOut(String parcelNumber) {
        return new SendState(getOrder());
    }
}



