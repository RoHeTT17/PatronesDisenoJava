/**
 * ! Patrón Builder:
 * Es un patrón de diseño creacional que nos permite construir objetos complejos
 * paso a paso.
 *
 * El patrón nos permite producir distintos tipos y representaciones
 * de un objeto empleando el mismo código de construcción.
 *
 * * Es útil cuando necesitamos construir un objeto complejo con muchas partes
 * * y queremos que el proceso de construcción sea independiente de las partes
 * * que lo componen.
 */

 //! Tarea: crear un QueryBuilder para construir consultas SQL

import builder.QueryBuilder;
import builder.QueryBuilder.typeOrder;

/**
  * Debe de tener los siguientes métodos:
  * - constructor(table: string)
  * - select(fields: string[]): QueryBuilder -- si no se pasa ningún campo, se seleccionan todos con el (*)
  * - where(condition: string): QueryBuilder - opcional
  * - orderBy(field: string, order: string): QueryBuilder - opcional
  * - limit(limit: number): QueryBuilder - opcional
  * - execute(): string - retorna la consulta SQL
  * 
  ** Ejemplo de uso:
   const usersQuery = new QueryBuilder("users") // users es el nombre de la tabla
     .select("id", "name", "email")
     .where("age > 18")
     .where("country = 'Cri'")
     .orderBy("name", "ASC")
     .limit(10)
     .execute();
 
   console.log('Consulta: ', usersQuery);
   // Select id, name, email from users where age > 18 and country = 'Cri' order by name ASC limit 10;
  */

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("********************PRIMERO**********************");
        QueryBuilder query = new QueryBuilder("predios");
      
        query.setSelect(new String[]{"predioid","clienteid","contrato"})
            //.serOrder("predioid", typeOrder.ASC)
            .setLimit(100)
            .build();


        System.out.println("********************SEGUNDOS**********************");
        QueryBuilder queryClient = new QueryBuilder("clientes");
      
        queryClient.setSelect(new String[]{"nombre","clienteid","email"})
                   .setWhere("clienteid=152","rfc='xxxxx xx'")
                   .setOrder("clienteID", typeOrder.ASC)
                   .setOrder("nombre", typeOrder.DESC)
                   .build();

    }
}
