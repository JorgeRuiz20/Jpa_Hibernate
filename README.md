# Proyecto JPA Hibernate - Spring Boot & MySQL

Proyecto minimalista con los 3 tipos de relaciones JPA para que al arrancar se generen automáticamente las tablas en MySQL:

1. **1 a 1**: `Usuario` <-> `Perfil`
2. **1 a N**: `Departamento` <-> `Empleado`
3. **N a N**: `Estudiante` <-> `Curso` (genera tabla intermedia `estudiante_curso`)

---

## ⚙️ Conexión MySQL configurada en `application.properties`:
- **URL**: `jdbc:mysql://localhost:3306/jpa_demo?createDatabaseIfNotExist=true`
- **Usuario**: `nadia`
- **Contraseña**: `1234`
- **DDL-Auto**: `update` (crea o actualiza las tablas al iniciar)

---

## 🚀 ¿Cómo arrancarlo?
```powershell
.\mvnw spring-boot:run
```
Al arrancar, abre MySQL (Workbench, phpMyAdmin, DBeaver o consola) y verás la base de datos `jpa_demo` con todas las tablas y claves foráneas creadas.
