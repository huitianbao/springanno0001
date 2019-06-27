package configClass;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
/*
metadataReader   当前类的信息
MetadataReaderFactory  其他类的信息

 */

public class MyFilterTypeCustom implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类注解的信息

        AnnotationMetadata annotationMetadata=metadataReader.getAnnotationMetadata();

        //获取当前正在扫描的类的信息

        ClassMetadata classMetadata= metadataReader.getClassMetadata();
        //获取当前类的资源  路径
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println("this is ------->   "+className);

        if (className.contains("er"))
            return true;
        else
            return false;



    }
}
