package aws.cloudformation.archiveDeploy.ec2Domain;


import aws.cloudformation.AwsTestConstants;
import aws.cloudformation.archiveDeploy.ec2Domain.suitetests.AwsDomainEc2FirstDeployAllGroupsTest;
import aws.cloudformation.archiveDeploy.ec2Domain.suitetests.AwsDomainEc2SecondDeployOtherGroupTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


/**
 * The order of the classes matters. The first one verify the archive is deployed. The second one doesn't deploy any and
 * verifies that undeploy operation works.
 */
@Suite
@SelectClasses({AwsDomainEc2FirstDeployAllGroupsTest.class, AwsDomainEc2SecondDeployOtherGroupTest.class})
public class DomainEc2DeploySuiteTests {
    public static final String suiteInstanceName = "domain-ec2-deploy-" + AwsTestConstants.instanceName;
}
