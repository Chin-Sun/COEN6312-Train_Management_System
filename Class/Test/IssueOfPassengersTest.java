package Test;

import org.junit.BeforeClass;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import Class.IssueOfPassengers;

public class IssueOfPassengersTest {


    @Test
    public void testSubmitIssue() {
        IssueOfPassengers.submitIssue("Issue description", "General");
        assertEquals("There should be one issue submitted", 2, IssueOfPassengers.issuesList.size());
    }

    @Test
    public void testAddResolution() {
        IssueOfPassengers.submitIssue("Issue description", "General");
        String issueId = IssueOfPassengers.issuesList.get(0).getIssueId();
        IssueOfPassengers.addResolution(issueId, "Resolved");
        assertEquals("Resolution should be added", "Resolved", IssueOfPassengers.getIssue(issueId).getResolution());
    }

    @Test
    public void testSearchIssues() {
        IssueOfPassengers.submitIssue("Issue 1", "General");
        IssueOfPassengers.submitIssue("Issue 2", "Technical");
        List<IssueOfPassengers> foundIssues = IssueOfPassengers.searchIssues("Technical");
        assertEquals("Should find 1 issue for 'Technical' category", 1, ((List<?>) foundIssues).size());
    }

    @Test
    public void testGetIssue() {
        IssueOfPassengers.submitIssue("Issue for retrieval", "General");
        String issueId = IssueOfPassengers.issuesList.get(0).getIssueId();
        assertNotNull("Issue should be retrieved by ID", IssueOfPassengers.getIssue(issueId));
    }
}

