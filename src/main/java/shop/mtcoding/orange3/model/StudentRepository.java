package shop.mtcoding.orange3.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentRepository {

    public List<Student> findAll();

    public Student findOne(int id);

    public int insert(@Param("name") String name, @Param("grade") int grade, @Param("email") String email);

    public int delete(int id);

    public int update(@Param("id") int id, @Param("grade") int grade, @Param("email") String email);
}
