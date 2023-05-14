package tp1.tp4.ej2;

import java.util.Calendar;

public abstract class Persona {

    private static final int VALOR_AUN_VIVE = -9999;
    private String nombreCompleto;
    private int anioNacimiento;
    private int anioFallecimiento;
    private int anioActual;

    /**
     * Constructor perosna viva
     *
     * @param nombreCompleto
     * @param anioNacimiento
     */
    public Persona(String nombreCompleto, int anioNacimiento) {
        this.setAnioActual();
        this.setNombreCompleto(nombreCompleto);
        this.setAnioNacimiento(anioNacimiento);
        this.anioFallecimiento = VALOR_AUN_VIVE;
    }

    /**
     * Constructor persona muerta
     *
     * @param nombreCompleto
     * @param anioNacimiento
     * @param anioFallecimiento
     */
    public Persona(String nombreCompleto, int anioNacimiento, int anioFallecimiento) {
        this.setAnioActual();
        this.setNombreCompleto(nombreCompleto);
        this.setAnioNacimiento(anioNacimiento);
        this.setAnioFallecimiento(anioFallecimiento);
    }

    /**
     * Guarda el anio actual para hacer las validaciones correspondientes a las fechas de nacimiento y fallecimiento.
     */
    private void setAnioActual() {
        anioActual = Calendar.getInstance().get(Calendar.YEAR);
    }

    private void setNombreCompleto(String nombreCompleto) {
        if (nombreCompleto == null || nombreCompleto.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio ni ser null");
        }
        this.nombreCompleto = nombreCompleto;
    }

    private void setAnioNacimiento(int anioNacimiento) {
        if (anioNacimiento > anioActual) {
            throw new IllegalArgumentException("El anio de nacimiento no puede estar en el futuro");
        }
        this.anioNacimiento = anioNacimiento;
    }
    
    /**
    * @param anioFallecimiento *           El anio de fallecimiento a asignar. No puede ser menor al      *           anio de nacimiento ni mayor al anio actual.
    */
   public void setAnioFallecimiento(int anioFallecimiento) {
       if (anioFallecimiento > anioActual) {
           throw new IllegalArgumentException("El anio de fallecimiento no puede estar en el futuro");
       }
       if (anioFallecimiento < anioNacimiento) {
           throw new IllegalArgumentException("No puede fallecer antes de nacer.");
       }

       this.anioFallecimiento = anioFallecimiento;
   }

   /**
    * @return el nombre completo de la persona.
    */
   public String getNombreCompleto() {
       return nombreCompleto;
   }

   /**
    * @return el anio de nacimiento de la persona.
    */
   public int getAnioNacimiento() {
       return anioNacimiento;
   }

   /**
    * @return el anio de fallecimiento de la persona.
    */
   public int getAnioFallecimiento() {
       return anioFallecimiento;
   }

   public boolean vive() {
       return this.anioFallecimiento == VALOR_AUN_VIVE;
   }

   @Override
   public String toString() {
       return "nombreCompleto: " + nombreCompleto + ", anioNacimiento: " + anioNacimiento + ", anioFallecimiento: " + anioFallecimiento ;
   }
}