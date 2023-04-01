# Minecraft Warp Tour

## Overview
Hooks into the Essentials warp system.

Create tours of your server based on warps, and allow players to keep track of which warps they have already visited.

Tours are lists of warps with a pre-defined order which players are encouraged to follow.

After visiting a warp via this tour plugin, the player will see an indication that they have already visited this warp when they open the tour again.

## Usage
Players run `/tour` to bring up a list of server tours. If there is only one tour, that tour is automatically selected.

`/tour list` will show all available tours.

`/tour reset` will let players reset their progress for a given tour.

## Configuration
- `autoDeleteIfDoesNotExist` - When a deleted warp in Essentials is referenced by the tour plugin, automatically delete it from any tours.
