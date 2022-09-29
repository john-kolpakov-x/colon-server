package kz.pompei.colon.register.client_impl.test_dao;

import kz.pompei.colon.model.client.ClientRecord;
import org.apache.ibatis.annotations.Insert;

public interface ClientTestDao {

  @Insert("insert into client.client (id, surname, name, patronymic) values (#{id}, #{surname}, #{name}, #{patronymic})")
  void insertClientRecord(ClientRecord c);
}
