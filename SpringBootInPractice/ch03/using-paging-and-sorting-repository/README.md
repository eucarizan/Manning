# Technique: Using PagingAndSortingRepository Interface to paginate and sort the data

- [Technique: Using PagingAndSortingRepository Interface to paginate and sort the data](#technique-using-pagingandsortingrepository-interface-to-paginate-and-sort-the-data)
  - [Description](#description)
  - [Problem](#problem)

## Description
In this technique, we'll demonstrate how to use Spring's PagingAndSortingRepository interface for pagination and sorting.

## Problem
Loading, sorting and returning a large set of data to the application users waste the server resources and impact the application user experience. You need to return the data into a smaller subset in terms of pages.