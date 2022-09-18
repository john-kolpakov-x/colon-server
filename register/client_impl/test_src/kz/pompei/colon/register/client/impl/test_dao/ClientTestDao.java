package kz.pompei.colon.register.client.impl.test_dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface ClientTestDao {

  @Insert("insert into client.client (id, surname, name, patronymic) values (#{id}, #{surname}, #{name}, #{patronymic})")
  void insertClient(@Param("id") String id,
                    @Param("surname") String surname,
                    @Param("name") String name,
                    @Param("patronymic") String patronymic);

}
