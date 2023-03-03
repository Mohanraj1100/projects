package assignment.credit;
import java.util.logging.*;

class CreditCard implements Cloneable{
    String cardholder;
    Long cardnumber;
    String expirydate;
    Long validcardno;
    Logger log=Logger.getLogger("hi");

    CreditCard(String cardholder, Long cardnumber, String expirydate) {
        this.cardholder = cardholder;
        this.cardnumber = cardnumber;
        this.expirydate = expirydate;
    }

    boolean equals(Long validcardno) {
    	this.validcardno = validcardno;
        return cardnumber.equals(validcardno);
    }

    void display() {
        if( cardnumber.equals(validcardno))
        {
                log.log(Level.INFO,()->"Cardholder name is"+ cardholder +" and card Number "+cardnumber+" And expiry date" + expirydate);
        }
        else
        {
            log.info("It is invalid");
        }
    }

    CreditCard co() {
    	try{
    		return (CreditCard)super.clone();
    		
    	}
    	catch(CloneNotSupportedException e)
    	{
    		log.info("Clowning error");
    		return this;
    	}
}
}