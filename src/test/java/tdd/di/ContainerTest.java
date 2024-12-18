package tdd.di;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class ContainerTest {
    interface Component {

    }

    @Nested
    public class ComponentConstruction {
        @Test
        public void should_bind_type_to_a_specific_instance() {
            Context context = new Context();
            Component instance = new Component() {
            };
            context.bind(Component.class, instance);
            assertSame(instance, context.get(Component.class));
        }

        //TODO: abstract class
        //TODO: interace
        @Nested
        public class ConstructorInjection {
            //TODO: No args constructor
            //TODO: with dependencies
            //TODO: A -> B -> C
        }

        @Nested
        public class FieldInjection {
        }

        @Nested
        public class MethodInjection {
        }
    }

    @Nested
    public class DependencySelection {
    }

    @Nested
    public class LifecycleManagement {
    }
}