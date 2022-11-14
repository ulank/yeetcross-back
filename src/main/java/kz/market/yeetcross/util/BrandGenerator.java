package kz.market.yeetcross.util;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.util.Properties;
import java.util.stream.Stream;

/**
 * @author Ulan
 * @date 11/9/2022
 */

public class BrandGenerator implements IdentifierGenerator {

    private String prefix;

    @Override
    public void configure(Type type, Properties params, ServiceRegistry serviceRegistry) throws MappingException {
        prefix = params.getProperty("prefix");
    }

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        String query = String.format("select %s from %s",
                session.getEntityPersister(object.getClass().getName(), object)
                        .getIdentifierPropertyName(),
                object.getClass().getSimpleName());

        Stream ids = session.createQuery(query).stream();

        Long max = ids.map(o ->
                o.toString().replace(prefix + "_", "")).mapToLong(num -> Long.parseLong((String) num)).max().orElse(0L);

        return prefix + "-" + (max + 1);
    }
}
