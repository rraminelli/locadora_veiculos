package br.letscode.bancobrasil.locadora.model;

import br.letscode.bancobrasil.locadora.exceptions.ClienteNaoInformadoException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public abstract class BaseModel<ID> {

    public void logAlteracao() {
        System.out.println("LOG - alteracao");
    }

    public void setId(ID id) {

        try {
            Class clazz = this.getClass();
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(br.letscode.bancobrasil.locadora.model.ID.class)) {
                    String fieldName = field.getName();
                    String methodName = "set" + fieldName.substring(0, 1).toUpperCase()
                            + fieldName.substring(1);
                    Method method = clazz.getDeclaredMethod(methodName, id.getClass());
                    //method.setAccessible(true);
                    method.invoke(this, id);
                    break;
                }
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        /*try {
            Class clazz = this.getClass();
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(br.letscode.bancobrasil.locadora.model.ID.class)) {
                    field.setAccessible(true);
                    field.set(this, id);
                    break;
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }*/

    }

}
