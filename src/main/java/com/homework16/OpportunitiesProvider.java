package com.homework16;

import java.util.List;

public interface OpportunitiesProvider {
    List<OpportunityBlock> getOpportunitiesBlocks();
    List<String> getOpportunities(List<OpportunityBlock> opportunityBlockList);
}
