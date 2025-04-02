package me.neovitalism.votereward.storage;

import me.neovitalism.neoapi.config.Configuration;
import me.neovitalism.neoapi.storage.AbstractStorage;
import me.neovitalism.votereward.VoteReward;

import java.util.Map;

public class NewVoteStorage extends AbstractStorage {
    // Idea: How to handle cross-server?
    // - DB Storage, if ONLINE player is in db, remove player & do nothing
    // - If player logs in that is in memory, execute commands & remove player
    //
    // - Only load voteparty count on server load?
    //
    //

    public NewVoteStorage() {
        super(VoteReward.inst(), true);
    }

    @Override
    public String getFileName() {
        return "stored-votes.yml";
    }

    @Override
    public Map<String, String> getTables() {
        return Map.of();
//        return Map.of("vote_reward", "player CHAR(36) PRIMARY KEY, owed_votes INT ");
    }

    @Override
    public void load(Configuration configuration) {

    }

    @Override
    public void loadToDB(Configuration configuration) {

    }
}
