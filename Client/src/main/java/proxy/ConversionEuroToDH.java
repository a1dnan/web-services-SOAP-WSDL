
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ConversionEuroToDH complex type.</p>
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="ConversionEuroToDH">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="montant" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionEuroToDH", propOrder = {
    "montant"
})
public class ConversionEuroToDH {

    protected int montant;

    /**
     * Obtient la valeur de la propri�t� montant.
     * 
     */
    public int getMontant() {
        return montant;
    }

    /**
     * D�finit la valeur de la propri�t� montant.
     * 
     */
    public void setMontant(int value) {
        this.montant = value;
    }

}
