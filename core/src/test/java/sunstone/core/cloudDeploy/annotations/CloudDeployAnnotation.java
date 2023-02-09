package sunstone.core.cloudDeploy.annotations;


import org.junit.jupiter.api.extension.ExtendWith;
import sunstone.annotation.SunstoneCloudDeployAnnotation;
import sunstone.core.SunstoneExtension;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SunstoneCloudDeployAnnotation
@Inherited
@ExtendWith({SunstoneExtension.class})
public @interface CloudDeployAnnotation {
}
