from templateframework.metadata import Metadata

def run(meta: Metadata = None):
    create_inputs(meta)
    return meta

def create_inputs(meta: Metadata):
    project_name = meta.global_inputs["project_name"].lower()
    splitted_project_name = project_name.split("-")

    project_name_capitalized = "".join(map(lambda word: word.capitalize(), splitted_project_name))
    resource_prefix = "bealge_" + "".join(splitted_project_name) + ""

    meta.global_inputs["project_name_capitalized"] = project_name_capitalized
    meta.global_inputs["resource_prefix"] = resource_prefix

    return None